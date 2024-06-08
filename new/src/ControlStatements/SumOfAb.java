package ControlStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SumOfAb {
    public static void main(String[] args) {

        int a ;
        int b ;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        a = sc.nextInt();

        System.out.println("enter the second number");
        b = sc.nextInt();


        if (a != 0 && b != 0) {
            sum = a + b;
            System.out.println("the sum of two number is" + sum);
        }
       else {
            System.out.println("invalid numbers");
        }
    }
}
