import java.util.HashMap;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class HashMapTest {
	private HashMap underTest;

	@Before
	public void setUp() throws Exception {
		this.underTest = new HashMap();
	}

	@Test
	public void testIsEmpty() {
		Assert.assertTrue(underTest.isEmpty());
	}
	
	@Test
	public void testIsNotEmpty() {
		underTest.put("1", "abc");
		Assert.assertFalse(underTest.isEmpty());
	}
	
	@Test
	public void testIsNotNull() {
		Assert.assertNotNull(underTest);
	}
	
	@Test
	public void testIsSizeZero() {
		Assert.assertEquals(0,underTest.size());
	}
	
	@Test
	public void testIsSizeNotZero() {
		underTest.put("1", "abc");
		Assert.assertTrue(underTest.size() > 0);
	}
	
//	// Test that an exception is thrown if a key does not exist
//    @Test(expected= NoSuchElementException.class)
//    public void testThrowsExceptionIfKeyDoesNotExist() {
//    	underTest.remove("Hello");
//    }
    
    @Test
    public void testSizeIncrementsWhenAddingElements() {
    	Assert.assertEquals(0,underTest.size());
    	underTest.put("1", "abc");
    	Assert.assertTrue(underTest.size() > 0);
    }
    
    @Test
    public void testGetReturnsCorrectValue() {
    	underTest.put("1", "abc");
    	underTest.put("2", "def");
    	Assert.assertEquals("abc",underTest.get("1"));
    }
    
    @Test
    public void testGetReturnsWrongValue() {
    	underTest.put("1", "abc");
    	underTest.put("2", "def");
    	Assert.assertFalse("def".equals(underTest.get("1")));
    }
    
 // Make sure size doesn't decrement below 0
    @Test
    public void testRemoveDoesNotEffectNewMap() {
    	underTest.remove("Hello");
    	Assert.assertEquals(0, underTest.size());
    }
    
    @Test
    public void testRemoveDoesEffectNewMap() {
    	Assert.assertEquals(0,underTest.size());
    	underTest.put("1", "abc");
    	Assert.assertTrue(underTest.size() > 0);
    	underTest.remove("1");
    	Assert.assertEquals(0, underTest.size());
    }

}
