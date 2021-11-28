package week1.exercise2.exercise1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // 1.Widening Primitive Conversion (Implicit)
        // 2.Write java program, which has byte type variable(Input variables from console)
        // 3.Cast byte to short type, print both variables
        // 4.Cast short to int type, print both variables
        // 5.Cast int to long, print both variables
        // 6.Cast long to float, print both variables
        // 7.Cast float to double type, print both variables

        Scanner scan = new Scanner(System.in);
        byte x = scan.nextByte();
        short r;
        r = x;
        System.out.println(r);
        System.out.println(x);

        System.out.println("Thank You");

    }
}
