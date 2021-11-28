package week1;

// 6. Generate and print random integer number between 2 to 7(not using bound)

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {

        Random x = new Random();
        int y = x.nextInt();
        if (y < 0) {
            int c = (-1) * (2 + y % 6);
            System.out.println(c);
        } else {
            int c = 2 + y % 6;
            System.out.println(c);
        }

    }
}
