package info1;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static Aufgabe1.hello;

public class Aufgabe1Test {

  @Test
	public void testHelloWorld() throws Exception {
		assertEquals("Hello, world", hello()); // Same test
	}

}
