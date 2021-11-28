package week1.exercise2.exercise3;

//Computer area and perimeter of circle.(Input double type radius from console)(PI = 3.14159)


import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner r = new Scanner(System.in);
        int a = r.nextShort();
        double PI = 3.14159;
        double paragic =  (2 * (a * PI));
        double makeres = (int) (PI * (a * a));
        System.out.println(paragic);
        System.out.println(makeres);
    }
}



