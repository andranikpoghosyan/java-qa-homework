package week1.exercise2;
//        Cast double to float,print both variables
//        Cast float to long, print both variables
//        Cast long to int, print both variables
//        Cast int to short, print both results
//        Cast short to byte, print both results

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextByte();
        float b;
        b = (float) a;
        System.out.println(a);
        System.out.println(b);

        System.out.println("Thank You");

    }
}
