
public class RecLinSearch {

	public static int recLinSearch(int [] arr, int startIndex, int key){
		
		if (startIndex >= arr.length) return -1;
		else if (key == arr[startIndex]) return startIndex;
		else return recLinSearch(arr, startIndex + 1, key);
	}
	
	 public static void main (String [] args) {
		 
		 int [] arr1 = {2,5,7,8,4,6,32,643,88};
		 
		 System.out.println("Expected 3");
		 System.out.print(recLinSearch(arr1, 0, 8));
		 
	 }
}
