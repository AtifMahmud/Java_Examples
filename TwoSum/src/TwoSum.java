/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */

import java.util.Arrays;

public class TwoSum {

	public static int[] twoSum(int [] num, int target) {
		int size = num.length;
		int diff = 0;
		int [] diffArray  = new int[size];
		int [] retArray = new int [2];
		
		for (int i = 0; i < size; i++) {
			for (int j = i; j < size; j++) {
				if((num[i] + num[j]) == target) {
					retArray[0] = j;
					retArray[1] = i;
				}
			}
		}
		
		return retArray;
	}
	
	public static void printArr(int [] arr) {
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i] +",");
		}
	}
	
	
	public static void main(String [] args) {
		
		int target = 25;
		int [] checkArray = {4,5,7,8,6,6,2,6,1,20};
		
		
		int [] showArray = twoSum(checkArray, target);
		
		System.out.println("Expected 1, 9");
		printArr(showArray);
	
	}
		
	
	
}
