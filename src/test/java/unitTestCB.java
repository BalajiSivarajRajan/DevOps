import junit.framework.Assert;
import org.junit.Test;

public class unitTestCB {

	@Test
	public void testPrintcbTest() {

		Assert.assertEquals(App.getHelloWorld(), "Hello, World Continuous buid");

	}

}