import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SoftwareSalesTest {

	// global software sales variable
	SoftwareSales s;
	
	@Before
	public void setUp() throws Exception {
		s = new SoftwareSales();
	}

	// R1: Buy one software package
	@Test
	public void testBuyOneSoftwarePackage() {
		double finalPrice = s.calculatePrice(1);
		// When comparing decimals in JUnit,
		// you must add a 3rd parameter to the
		// assertEquals() function
		// For the 3rd parameter, use a really 
		// small number, like 0 or 0.001
		assertEquals(99, finalPrice, 0);
	}
	
	// R2: Buy 10-19 packages, get 20%
	@Test
	public void testBuy10Packages() {
		// Expected result = 20% discount
		double finalPrice = s.calculatePrice(12);
		assertEquals(950.4, finalPrice, 0);
	}
	
	
	// R3: Buy 20-49, get 30% discount
	@Test
	public void testBuy20Packages() {
		double finalPrice = s.calculatePrice(30);
		assertEquals(2079, finalPrice, 0);
	}
	
	
	//R4:Buy 50-99 packages, get 40% discount
	@Test
	public void testBuy50Packages() {
		double finalPrice = s.calculatePrice(60);
		assertEquals(3564, finalPrice, 0);
	}
	
	//R5: Buy 100+ packages, get 50% discount
	@Test
	public void testBuy100Packages() {
		double finalPrice = s.calculatePrice(120);
		assertEquals(5940, finalPrice, 0);
	}
	
	//R6: Quantity < -1 should return -1
	@Test
	public void testNegativeQuantity() {
		double finalPrice = s.calculatePrice(-50);
		assertEquals(-1, finalPrice, 0);
	}
	
	// Not a requirement, but good to test 
	@Test
	public void testZeroQuantity() {
		double finalPrice = s.calculatePrice(0);
		assertEquals(0, finalPrice,0);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
