/**
 * Program to demonstrate the recursive Ackermann function
 */

public class Ackermann {

    public static int ackermann(int x, int y){
        if (x == 0) return (y + 1);
        else if (y == 0) return ackermann(x - 1, 1);
        else
            return ackermann(x - 1, ackermann(x - 1, y - 1));

    }

    public static void main (String [] args){
        //System.out.println(ackermann(0, 0));
        //System.out.println(ackermann(100, 107));
        System.out.println(ackermann(100, 176));

    }
}
