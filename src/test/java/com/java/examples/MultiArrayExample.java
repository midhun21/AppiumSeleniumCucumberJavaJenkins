package com.java.examples;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class MultiArrayExample {

	@Test
	public void multiArray() {
		int[][] multi = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		assertEquals(1, multi[0][0]);
	}

	@Test
	public void createTriangle2dArray() {

		int[][] triangle = new int[16][];
		print2DIntArray(triangle);
		triangle[0] = new int[10];
		print2DIntArray(triangle);
		System.out.println("Lenght of Triangle 2d array is: " + triangle.length);
		for (int row = 0; row < triangle.length; row++) {
			triangle[row] = new int[row + 1];
			for (int i = 0; i < (row + 1); i++) {
				triangle[row][i] = i;
			}
		}
		// print2DIntArray(triangle);
	}

	public void print2DIntArray(int[][] multi) {
		System.out.println("*******************");
		for (int[] outer : multi) {
			if (outer == null) {
				System.out.print("null");
			} else {
				for (int inner : outer) {
					System.out.print(inner + ",");
				}
			}
			System.out.println("");
		}
		System.out.println("*******************");
	}
}