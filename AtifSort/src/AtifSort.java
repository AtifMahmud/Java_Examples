/**
 * The first sorting algorithm that comes to mind
 * Easy to code
 *
 * A simpler version of bubble sort
 */

public class AtifSort {
	
	public static int [] sort(int [] arr) {
		int temp;
		
		for (int i=0; i < arr.length-1; i++) {
			for(int j=0; j < arr.length-1; j++) {
				
				if(arr[j] > arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
			
				}
			}
		}
		
		
		return arr;
	}
	
	
	public static void printArr(int [] arr) {
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i] +",");
		}
	}
	
	
	public static void main(String[] args) {
		
		int [] arr1 = {1,8,7,6,53,8,43,55,0};
		int [] arr2 = {2,7,532,8,3,21,3,4,5,3,1,3,4,5};
		int [] arr3 = {-1, 5, 7, 537, 7};
		
		printArr(arr1); 
		System.out.print("   ");
		printArr(sort(arr1));
		System.out.print("\n\n");
		
		printArr(arr2); 
		System.out.print("   ");
		printArr(sort(arr2));
		System.out.print("\n\n");
		
		printArr(arr3); 
		System.out.print("   ");
		printArr(sort(arr3));
		System.out.print("\n\n");
		
	}
}
