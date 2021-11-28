package week1.exercise2;

import java.util.Scanner;

//        Cast int to short, print both results

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int g = scan.nextByte();
        short h;
        h = (short) g;
        System.out.println(h);
        System.out.println(g);

        System.out.println("Thank You");
    }
}
