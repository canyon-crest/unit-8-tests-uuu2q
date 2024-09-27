package com.csplusplus;

public class Unit8 {

    // 1. Method to calculate the sum of all elements in a 2D array
    // Instructions: Traverse the 2D array and calculate the sum of all elements.
    public static int sumOfElements(int[][] array) {
    	int sum = 0;
        for (int[] row : array) {
        	for (int elem : row) {
        		sum += elem;
        	}
        }
        return sum;
    }

    // 2. Method to count how many times a specific number appears in a 2D array
    // Instructions: Traverse the 2D array and count the number of times a specified value appears.
    public static int countOccurrences(int[][] array, int value) {
        int count = 0;
    	for (int[] row : array) {
        	for (int elem : row) {
        		if (elem == value) {
        			count++;
        		}
        	}
        }
        return count;
    }

    // 3. Method to find the maximum element in a 2D array
    // Instructions: Traverse the 2D array and find the maximum element.
    public static int findMax(int[][] array) {
        int max = array[0][0];
        for (int[] row : array) {
        	for (int elem : row) {
        		if (max<elem) {
        			max = elem;
        		}
        	}
        }
        return max;
    }

    // 4. Method to reverse the rows of the 2D array
    // Instructions: Reverse the rows of the 2D array (e.g., the first row becomes the last, etc.).
    public static void reverseRows(int[][] array) {
        for (int row = 0; row < array.length/2; row++) {
        	int[] temp = array[row];
        	array[row] = array[array.length-1-row];
        	array[array.length-1-row] = temp;
        }
    }

    // 5. Method to transpose a 2D array (swap rows and columns)
    // Instructions: Create and return a new 2D array that is the transpose of the input array.
    public static int[][] transpose(int[][] array) {
        int[][] transposed = new int[array[0].length][array.length];
        for (int row = 0; row < array.length; row++) {
        	for (int col = 0; col < array[0].length; col++) {
        		transposed[col][row] = array[row][col];
        	}
        }
        return transposed;
    }

    // 6. Method to fill a 2D array with random integers
    // Instructions: Create a 2D array of size numRows x numCols and fill it with random integers between min and max.
    public static int[][] fillWithRandom(int min, int max, int numRows, int numCols) {
        int[][] arr2d = new int[numRows][numCols];
        for (int row = 0; row < numRows; row++) {
        	for (int col = 0; col < numCols; col++) {
        		arr2d[row][col] = (int)(Math.random()*(max-min+1))+min;
        	}
        }
        return arr2d;
    }
}