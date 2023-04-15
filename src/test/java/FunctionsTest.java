import static org.junit.jupiter.api.Assertions.*;

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

public class FunctionsTest {
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
            "let void foo(){}",
            "let Integer foo(){}",
            "let Boolean foo(Integer a){}",
            "let String _getter(){}"
    })
    public void validTypeTest(String code){
        var root = getTree(code);
        assertEquals(1, root.getChildren().size());
        assertEquals(FunctionDeclNode.class, root.getChildren().get(0).getClass());
    }
    @ParameterizedTest
    @ValueSource(strings = {
            "let VOID foo(){}",
            "let if foo(){}",
            "let sometype foo(Integer a){}"
    })
    public void invalidTypeTest(String code){
        assertThrows(org.antlr.v4.runtime.misc.ParseCancellationException.class, ()->getTree(code));
    }
    @ParameterizedTest
    @ValueSource(strings = {
            "let Integer foo(){}",
            "let Boolean SETTER1232(Integer a){}",
            "let Integer _getter(){}"
    })
    public void validFuncNameTest(String code){
        var root = getTree(code);
        assertEquals(1, root.getChildren().size());
        assertEquals(FunctionDeclNode.class, root.getChildren().get(0).getClass());
    }
    @ParameterizedTest
    @ValueSource(strings = {
            "let Integer 123(){}",
            "let Integer (){}",
            "let void d!!!!sfsdf(){}",
            "let void void(){}",
            "let void foo(Integer if){}"
    })
    public void invalidFuncNameTest(String code){
        assertThrows(org.antlr.v4.runtime.misc.ParseCancellationException.class, ()->getTree(code));
    }
    @ParameterizedTest
    @ValueSource(strings = {
            "let Integer foo(Integer a, Boolean b){}",
            "let Boolean SETTER1232(String c, Integer a){}",
            "let Integer _getter(Boolean d, Boolean _str_valid){}"
    })
    public void paramsTest(String code){
        var root = getTree(code);
        assertEquals(1, root.getChildren().size());
        assertEquals(FunctionDeclNode.class, root.getChildren().get(0).getClass());
        var fnode =  (FunctionDeclNode)root.getChildren().get(0);
        assertEquals(2, fnode.getArgs().size());
    }

}
