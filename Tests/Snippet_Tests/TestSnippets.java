import org.antlr.runtime.*;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

    public class TestSnippets {

        public static void main(String[] args) throws Exception {

	 // print out the name of the case being tested
        System.out.println(args[0]);

	 // crete new stream that feeds in the file from args[0]
        DataInputStream stream = new DataInputStream(new FileInputStream(args[0]));

        // Create an input character stream from the stream
        ANTLRInputStream input = new ANTLRInputStream(stream);

        // Create a PassLexer that feeds from that stream
        PassLexer lexer = new PassLexer(input);

        // Create a stream of tokens fed by the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create a parser that feeds off the token stream
        PassParser parser = new PassParser(tokens);

        // Begin parsing at rule prog
        parser.prog();

        }	
    }
