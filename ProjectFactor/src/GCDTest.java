import org.junit.Assert;

import java.util.ArrayList;

import org.junit.Test;

public class GCDTest {

	@Test
	public void testGCD() {
		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(12);
		test.add(64);
		test.add(100);
		test.add(16);
		Assert.assertEquals("The GCD should be 4", 4, Main.getGCD(test));
		test.add(2);
		Assert.assertEquals("The GCD should be 2", 2, Main.getGCD(test));
	}

}
