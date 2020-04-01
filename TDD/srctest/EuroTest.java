import static org.junit.Assert.*;

import org.junit.Test;

/*
 Euro class - to do:
 */
public class EuroTest {

	@Test
	public void testToString() {

		assertEquals("EUR 2,00", new Euro(2).toString()); 
		assertEquals("EUR 7,50", new Euro(7.5).toString()); 
	}

	@Test
	public void testEquality() {
		final Euro euro1 = new Euro(1);
		final Euro euro2 = new Euro(1);
		assertEquals(euro1,euro2); 
	}

	@Test
	public void testInequality() {
		Euro sevenEuros = new Euro(7);
		Euro threeEuros = new Euro(3);
		assertFalse(sevenEuros.equals(threeEuros));
	} 

	@Test
	public void testSubtraction() { 
		assertEquals(new Euro(1), new Euro(3).minus(new Euro(2)));
		assertEquals(new Euro(2), new Euro(5).minus(new Euro(3))); 
	}

	@Test
	public void testNumericSafety() { 
		assertEquals(new Euro(0.61), new Euro(1.03).minus(new Euro(0.42)));
	}

	// 1 create test
	// 2 run test - it will fail
	// 3 make the code compile
	// 4 run test - it will fail
	// 5 edit class
	// 6 run test - test will pass

}