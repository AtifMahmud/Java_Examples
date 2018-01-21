/**
 * Insertion Sort implemented for self-learning + review of CPSC221: Data Structures and Algorithms
 * (Lecture Slides by Geoff Tien)
 * Also based on my learning from Harvard's CS50
 *
 *
 * @Date: 6th October, 2017, Updated: 21st October, 2017
 *
 */

public class Sort {


    /*
     * Insertion sort, like selection sort, divides array up into sorted and unsorted
     * And at every iteration, we "insert" element at appropriate position in the sorted portion
     */
    public static void insertionSort(int [] arr){
        int size = arr.length;
        int temp, pos;

        for(int i = 1; i < size; i++){
            pos = i;
            temp = arr[i]];

            while (pos > 0 && temp > arr[pos]){
                arr[pos] = arr[pos - 1];
                pos--;
            }

            arr[pos] = temp;
        }
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
        printArr(insertionSort(arr1));
        System.out.print("\n\n");

        printArr(arr2);
        System.out.print("   ");
        printArr(insertionSort(arr2));
        System.out.print("\n\n");

        printArr(arr3);
        System.out.print("   ");
        printArr(insertionSort(arr3));
        System.out.print("\n\n");

    }
}

