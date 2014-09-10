import org.junit.Assert;

import java.util.ArrayList;

import org.junit.Test;

public class FactorTest {

	@Test
	public void testFactorValues() {
		ArrayList<Integer> factors = Main.factors(67);
		Assert.assertEquals("Value should be 1", 1, factors.get(0).intValue());
		Assert.assertEquals("Value should be 67", 67, factors.get(1).intValue());
	}
	
	@Test
	public void testFactorSize() {
		ArrayList<Integer> factors = Main.factors(100);
		Assert.assertEquals("The length should be 9", 9, factors.size());
		factors = Main.factors(12);
		Assert.assertEquals("The length should be 6", 6, factors.size());
	}
	


}
