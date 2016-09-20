package miscexercises.test;

import static org.junit.Assert.*;

import org.junit.Test;

import miscexercises.RandomNumbers;

public class RandomNumbersTest {

	@Test
	public void testApproximatePi() {
		double r = RandomNumbers.approximatePi(1000000);
		assertTrue(Math.abs(r - Math.PI) < 0.01);
	}

}
