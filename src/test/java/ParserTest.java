import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.parsotangue.ParsoTangueLexer;
import org.parsotangue.ParsoTangueParser;
import org.parsotangue.ParsoTangueVisitorToAST;
import org.parsotangue.ast.nodes.FileNode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ParserTest {
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
            "let void foo( { Integer foo := 12;}",
            "let void foo() ",
            "void foo() { Boolean _foo := true;}",
            "void foo() { Boolean _foo := true;}",
    })
    public void mismatchError(String code){
        assertThrows(org.antlr.v4.runtime.misc.ParseCancellationException.class, ()->getTree(code));
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
    @Test
    public void emptyFileTest(){
        var root = getTree("");
    }
    @Test
    public void funcInFuncTest(){
        String code = "let foo(){ let bar(){} }";
        assertThrows(org.antlr.v4.runtime.misc.ParseCancellationException.class, ()->getTree(code));
    }
    @Test
    public void listingsTest() throws IOException {
       String code = Files.readString(Path.of("src/test/java/listings.txt"));
       getTree(code);
    }
}
