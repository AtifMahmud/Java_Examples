public class FindThreeMin {

    public static void main(String [] args){
        int [] arr1 = {7,85,3,4,50,1,8,9,4,0};
        threemin(arr1);
    }

    private static void threemin(int [] arr){
        int min1 = arr[0];
        int min2 = arr[1];
        int min3 = arr[2];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min1) {
                min1 = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min2 && arr[i] > min1) {
                min2 = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min3 && arr[i] > min2) {
                min3 = arr[i];
            }
        }


        System.out.println(min1 + " " + min2 + " " + min3);
    }
}
