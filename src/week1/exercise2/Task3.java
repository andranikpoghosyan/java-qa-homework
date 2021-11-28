package week1.exercise2;

import java.util.Scanner;

//        Cast long to int, print both variables

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long e = scan.nextByte();
        int f;
        f = (int) e;
        System.out.println(f);
        System.out.println(e);

        System.out.println("Thank You");
    }
}
