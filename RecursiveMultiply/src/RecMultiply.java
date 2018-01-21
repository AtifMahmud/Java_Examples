/**
 * Fucntion that multiplies two numbers using recursion
 * Used as an example for mathematical induction in CPSC221
 *
 * Slides by: Cinda Heeren
 */

public class RecMultiply {

    public static int recTimes(int a, int b){

        if (a == 0 || b == 0) return 0;
        if (b==1) return a;

        // Since b is even, we can keep dividing by 2 to reach the base case
        else if (b%2 == 0)
            return recTimes(2*a, b/2);

        // Make b even, and add an extra a to compensate for b-1
        else return
            a + recTimes(2*a, (b-1)/2);
    }


    public static void main (String[] args){

        System.out.println("Expected 8..." + recTimes(2,4) );
        System.out.println("Expected 0..." + recTimes(6,0));
        System.out.println("Expected 37..." + recTimes(7,5));

    }
}
