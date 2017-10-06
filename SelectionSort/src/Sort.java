/**
 * Selection Sort implemented for self-learning + review of CPSC221: Data Structures and Algorithms
 * (Lecture Slides by Geoff Tien)
 * Also based on my learning from Harvard's CS50
 *
 *
 * @Date: 5th October, 2017
 *
 */

public class Sort {

    /*
     * The idea is to divide the list/array into two parts: (i) Sorted, and (ii) Unsorted
     * At every step, we move an element from the unsorted part to the sorted part
     * We look for the MINIMUM UNSORTED ELEMENT. Therefore, we have to keep track of the minimum
     *
     * CAN SWAP MINIMUM WITH INDEX 0 ELEMENT, EVEN IF IT DISRUPTS "SORTEDNESS" THE ARRAY CAME IN
     *
     * Did void, because it will just sort the array; not create a new one
     *
     */
    public static void selectionSort(int [] arr){
        int size = arr.length;
        int min;
        int temp;

        for(int i = 0; i < size - 1; i++){
            min = i;

            for(int j = i + 1; j < size; j++){
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }

            // swap : need to use min, cuz j is out of scope
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
    }


    public static void printArr(int [] arr) {
        for(int i=0; i < arr.length; i++) {
            System.out.print(arr[i] +",");
        }
    }

    public static void main(String [] args){
        int [] arr1  =  {7,8,3,6,32,8,6,54,9,7};
        printArr(arr1);
        System.out.println("\nNow we will sort");
        selectionSort(arr1);
        printArr(arr1);
    }

}
