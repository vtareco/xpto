import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class GreetingTest {
	
	private Greetings underTest;
	
	@Before
	public void setup(){
//		Mockito.init(this);
		underTest = new Greetings();
	}
	
	@Test
	public void test() {
		Assert.assertEquals("hello world", underTest.toString());
	}

}
