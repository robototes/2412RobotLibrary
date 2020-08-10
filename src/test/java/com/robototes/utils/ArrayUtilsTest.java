package com.robototes.utils;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrayUtilsTest {

	@Test
	public void testCombineArrays() {
		Double[] arrayOne = { 1d, 2d, 3d };
		Double[] arrayTwo = { 4d, 5d, 6d };

		Double[] stacked = ArrayUtils.stackArrays(arrayOne, arrayTwo);

		Double[] actual = { 1d, 2d, 3d, 4d, 5d, 6d };

		assertArrayEquals("Stacking two arrays", actual, stacked);

	}

	@Test
	public void testPrintArray() {
		Double[] arrayOne = { 1d, 2d, 3d };

		assertEquals("Printing an array", ArrayUtils.printArray(arrayOne), "[0]: 1.0, [1]: 2.0, [2]: 3.0");
		
		System.out.println("Waiting a bit");
		for (int i=0; i<5; i++) {
			try {
				Thread.sleep(1001);
				System.out.println(i);
			} catch (InterruptedException ignored) {}
		}
		System.out.println("Done!");

	}

}
