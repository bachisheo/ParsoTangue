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

public class OperatorsTest {
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
            "let Integer foo() { return 12;}",
            "let Integer foo() { return a + b;}",
            "let void foo(){return;}"
    })
    public void returnOperatorTest(String code) {
        getTree(code);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "let Integer foo() { if(a){} else {}}",
            "let Integer foo() { if(a){} else if (b) {if (a) {}} else {}}",
            "let Integer foo() { if (1 + \"str\") {Boolean b := 42; }}",
    })
    public void ifOperatorTest(String code) {
        getTree(code);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "let Integer foo() { if 12 {}}",
            "let void foo(){else {}};",
            "let void foo(){if;};",
            "let void foo(){if {} else {};",
    })
    public void invalidIfTest(String code) {
        assertThrows(org.antlr.v4.runtime.misc.ParseCancellationException.class, () -> getTree(code));
    }
    @ParameterizedTest
    @ValueSource(strings = {
            "let Integer foo() { Integer a := 12;}",
            "let Integer foo() { Integer a := (12 + 123 * noote) / 2;}",
    })
    public void assignOperatorTest(String code) {
        getTree(code);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "let Integer foo() { Integer b = 12;}",
    })
    public void invalidAssignTest(String code) {
        assertThrows(org.antlr.v4.runtime.misc.ParseCancellationException.class, () -> getTree(code));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            ";",
            "let Integer foo() { return a + b}",
            "let void foo(){return;};",
            "let void foo(){if;};",
            "let Integer foo() { Integer b = 12}"
    })
    public void invalidCommaTest(String code) {
        assertThrows(org.antlr.v4.runtime.misc.ParseCancellationException.class, () -> getTree(code));
    }

}