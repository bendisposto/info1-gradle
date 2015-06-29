package info1;
import org.junit.Assert;
import org.junit.Test;

public class Aufgabe1Test {

  @Test
	public void testException1() throws Exception {
		Assert.assertEquals("Hello, world", new Aufgabe1().hello());
	}

}
