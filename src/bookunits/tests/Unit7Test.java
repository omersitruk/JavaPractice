package bookunits.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import bookunits.Unit7;

public class Unit7Test {

	@Test
	public void testRepeat50() {
		assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", Unit7.repeat50("a"));
	}
	@Test
	public void testDigitSum() {
		assertEquals(11, Unit7.digitSum(128));
	}

}
