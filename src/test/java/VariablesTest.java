import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.parsotangue.ParsoTangueLexer;
import org.parsotangue.ParsoTangueParser;
import org.parsotangue.ParsoTangueVisitorToAST;
import org.parsotangue.ast.nodes.FileNode;
import org.parsotangue.ast.nodes.FunctionDeclNode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class VariablesTest {
    private FileNode getTree(String code){
        var charStream = CharStreams.fromString(code);
        var lexer = new ParsoTangueLexer(charStream);

        var tokenStream = new CommonTokenStream(lexer);
        var parser = new ParsoTangueParser(tokenStream);
        parser.setErrorHandler( new BailErrorStrategy());

        var visitor = new ParsoTangueVisitorToAST();
        var root = visitor.visitFile(parser.file());
        return root;
    }
    @ParameterizedTest
    @ValueSource(strings = {
                    "let void foo() { Integer foo;}",
                    "let void foo() { float SETTER1232 := \"Wather\";}",
                    " Boolean _foo := true;"
    })
    public void commonErrorsTest(String code){
        assertThrows(org.antlr.v4.runtime.misc.ParseCancellationException.class, ()->getTree(code));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "let void foo() { Integer foo := 12;}",
            "let void foo() { String SETTER1232 := \"Wather\";}",
            "let void foo() { Boolean _foo := true;}"
    })
    public void validNameTest(String code){
        var root = getTree(code);
        assertEquals(1, root.getChildren().size());
        assertEquals(FunctionDeclNode.class, root.getChildren().get(0).getClass());
    }
    @ParameterizedTest
    @ValueSource(strings = {
            "let void foo() { Integer 123 := 12;}",
            "let void foo() { String sad!das := \"Wather\";}",
            "let void foo() { Boolean void := true;}"
    })
    public void invalidNameTest(String code){
        assertThrows(org.antlr.v4.runtime.misc.ParseCancellationException.class, ()->getTree(code));
    }

}
