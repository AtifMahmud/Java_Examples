public class FindThreeMin {

    public static void main(String [] args){
        int [] arr1 = {1,2,3};
        int [] arr2 = {10000,2,4,5,2,1,0};
        int [] arr3 = {2,1,3,1000};
        int [] arr4 = {9,8,7,1,2,3,0,1,1,0};
        int [] arr5 = {0,0,1,6,7,8,4,1,2,3000000,2};
        int [] arr6 = {0,9,2,1,0,0,0,18};
        threemin(arr1);
        threemin(arr2);
        threemin(arr3);
        threemin(arr4);
        threemin(arr5);
        threemin(arr6);
    }

    private static void threemin(int [] arr){
        int min1 = arr[0];
        int min2 = arr[1];
        int min3 = arr[2];
        int temp, index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min1) {
                min1 = arr[i];
                index = i;
            }
        }
        temp = arr[index];
        arr[index] = arr[0];
        arr[0] = temp;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= min2 && arr[i] >= min1) {
                min2 = arr[i];
                index = i;
            }
        }
        temp = arr[index];
        arr[index] = arr[1];
        arr[1] = temp;

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] <= min3 && arr[i] >= min2) {
                min3 = arr[i];
                index = i;
            }
        }
        temp = arr[index];
        arr[index] = arr[2];
        arr[2] = temp;


        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
    }
}
