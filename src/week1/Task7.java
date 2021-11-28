package week1;

//  7. Input from console int a and int b, if a and b corresponds for following requirements print
//  “Both a and b legal”, if any of them does not correspond print about it like this “a is legal b is illegal ''.
//  or vice versa

//        a > 10 and b is not equal to 10
//        both a and b is positive
//        both a and b is negative
//        a > 10 b < 1 both of them are odd
//        a is a multiple of 5 OR b is a multiple of 5
//        a is not a multiple of 5 but b is a multiple of 5


import java.util.Random;

public class Task7 {
    public static void main(String[] args) {

        Random x = new Random();
        int a = x.nextInt();
        Random b = new Random();
        int c = b.nextInt();

        if (a > 10 || c != 10) {
            if (a<= 10)
        }

            System.out.println(a);
        System.out.println(c);

//        if (a > 10 || b != 10) {

    }
}

