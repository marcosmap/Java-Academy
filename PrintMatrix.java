package com.ibm.java.academy.arrays;

public class PrintMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		generateMatrix(n);
	}
	
	public static void generateMatrix(int n) {
		
		int matrix[][] = new int[n][n];
		
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix.length; j++) {
				if (i == 0 || i == matrix.length - 1)
					matrix[i][j] = 1;
				else {
					if (j == i)
						matrix[i][j] = 1;
					if (i+j == matrix.length-1)
						matrix[i][j] = 1;
				}
			}
		}
	
		printMatrix(matrix);
		
	}
	
	public static void printMatrix(int matrix[][]) {
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}


