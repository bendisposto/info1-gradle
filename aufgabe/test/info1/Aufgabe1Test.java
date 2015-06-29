package info1;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static info1.Aufgabe1.hello;

public class Aufgabe1Test {

  @Test
	public void testHelloWorld() throws Exception {
		assertEquals("Hello, world", hello());
	}

}
