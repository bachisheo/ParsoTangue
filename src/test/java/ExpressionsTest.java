import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.parsotangue.ParsoTangueLexer;
import org.parsotangue.ParsoTangueParser;
import org.parsotangue.ParsoTangueVisitorToAST;
import org.parsotangue.ast.nodes.FileNode;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExpressionsTest {
    private FileNode getTree(String code) {
        var charStream = CharStreams.fromString(code);
        var lexer = new ParsoTangueLexer(charStream);

        var tokenStream = new CommonTokenStream(lexer);
        var parser = new ParsoTangueParser(tokenStream);
        parser.setErrorHandler(new BailErrorStrategy());

        var visitor = new ParsoTangueVisitorToAST();
        var root = visitor.visitFile(parser.file());
        return root;
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "let Integer foo() { Integer a := 1 + 12 * 5;}",
            "let Integer foo() { Integer a := 1 + 12 * 3 / (34 + 48);}",
            "let Integer foo() { Boolean a := 3 < 4 == false;}",
            "let Integer foo() { Boolean a := 3 <= 4 ;}",
            "let Integer foo() { Integer a := 1 + 12 * 3 % (34 + 48);}",
            "let Integer foo() { if ((a < 12) == (b >= 45)) {Boolean res := 3 <= 12 != 90 >= 43;}}"
    })
    public void validExprTest(String code) {
        getTree(code);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "let Integer foo() { 2 * (1 + 3;}",
            "let void foo(){ 2 * (1 + (3 - 4);};",
            "let void foo(){ a == b == c)};"
    })
    public void missMatchBracketTest(String code) {
        assertThrows(org.antlr.v4.runtime.misc.ParseCancellationException.class, () -> getTree(code));
    }


}