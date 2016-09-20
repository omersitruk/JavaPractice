package miscexercises.test;
import static org.junit.Assert.*;

import org.junit.Test;

import miscexercises.Sorts;

public class SortsTest {

	@Test
	public void testMaxSort() {
		int[] array = new int[] { 2, 54, 3, 644, 334, 544 };
		Sorts.maxSort(array);
		int[] expected = new int[] { 2, 3, 54, 334, 544, 644 };
		assertArrayEquals(expected, array);
	}

}
