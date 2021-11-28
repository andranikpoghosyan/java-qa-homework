package week1;

// 5. Write a Java program to allow the user to input his/her age.
// Then the program will show if the person is eligible to vote.
// A person who is eligible to vote must be older than or equal to 18 years old.

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        System.out.println("How old are you dear voter?");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if (age >= 18) {
            System.out.println("You can vote");
        } else {
            System.out.println("You can't vote, sorry");
        }
    }
}
