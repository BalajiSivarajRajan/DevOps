import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class cbHelloWorldTest {

	private cbHelloWorld cbHWObject = new cbHelloWorld();

	@Test
	public void utSrc() {
		assertThat(cbHWObject.sayHello(), containsString("Hello-fail"));
	}

}
