package bookunits.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import bookunits.Unit5;

public class Unit5Test {

	@Test
	public void testCalcShips() {
		assertEquals(6, Unit5.calcShips(60, 10));
		assertEquals(9, Unit5.calcShips(60, 7));
	}
	@Test
	public void testHighGrades() {
		assertEquals(1, Unit5.highGrades(90, 70));
		assertEquals(2, Unit5.highGrades(92, 94));
		assertEquals(0, Unit5.highGrades(70, 70));

	}
}
