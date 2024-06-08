package Homework2;

import java.util.Scanner;

public class FourFunctionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,ad,s,m,d;
        System.out.println("enter the first number: ");
        a = sc.nextInt();

        System.out.println("enter the next number: ");
        b = sc.nextInt();
        int n;
        System.out.println("enter the the calculation function you need: ");
        n = sc.nextInt();

        switch (n){
            case 1:
                ad = a + b;
                System.out.println(ad);
                break;
            case 2:
                s = a - b;
                System.out.println(s);
                break;
            case 3:
                m = a * b;
                System.out.println(m);
                break;
            case 4:
                d = a / b;
                System.out.println(d);
                break;
            default:
                System.out.println("None of the above");
        }


    }

}
