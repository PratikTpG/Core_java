package ControlStatements;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        int r = 0;
        double pi = 3.14;
        double area;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");
        r = sc.nextInt();
        if (r != 0) {
            area = pi * r * r;
            System.out.println("Area of circle is" + area);
        }
        else {
            System.out.println("invalid value");
        }
    }

}
