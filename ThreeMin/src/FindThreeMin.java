public class FindThreeMin {

    public static void main(String [] args){
        int [] arr1 = {2,1,3,1000};
        threemin(arr1);
    }

    private static void threemin(int [] arr){
        int min1 = arr[0];
        int min2 = Integer.MAX_VALUE;
        int min3 = Integer.MAX_VALUE ;

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
