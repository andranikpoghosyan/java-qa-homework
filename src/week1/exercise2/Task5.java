package week1.exercise2;

//        Cast short to byte, print both results

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        short i = scan.nextByte();
        byte j;
        j = (byte) i;
        System.out.println(i);
        System.out.println(j);

        System.out.println("Thank You");
    }
}
