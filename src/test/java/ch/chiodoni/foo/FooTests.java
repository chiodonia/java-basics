package ch.chiodoni.foo;

import ch.chiodonia.foo.Foo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FooTests {

    private final PrintStream standardOut = System.out;
    private final PrintStream standardErr = System.err;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errStream = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStream));
        System.setErr(new PrintStream(errStream));
    }

    @Test
    public void testFoo() {
        String[] args = {"5.0", "6.0"};
        Foo.main(args);
        assertEquals("Media: 5.50", outputStream.toString().trim());
    }

    @Test
    public void testFooSenzaParametri() {
        String[] args = {};
        Foo.main(args);
        assertEquals("Devi passare dei numeri...", errStream.toString().trim());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
        System.setErr(standardErr);
    }

}
