package Homework2;

import java.util.Scanner;

public class ThreeSidesOFTriangle {
    public static void main(String[] args) {
        input();
    }
    static void input (){
        Scanner sc = new Scanner(System.in);

        int h;
        System.out.println("Enter the hypotenuse of the triangle: ");
        h = sc.nextInt();

        int p;
        System.out.println("Enter the perpendicular of the triangle: ");
        p = sc.nextInt();

        int b;
        System.out.println("Enter the base of the triangle: ");
        b = sc.nextInt();

        process(h, p, b);


    }
    static void process(int h , int p , int b){

        if (p+b>=h || h+b>=p || h+p>=b){
            System.out.println("the triangle is an valid triangle");
           if (p==b && p==h && h==b){
               System.out.println("this is an equilateral triangle");
           }
           else if (p==b || p==h || h==b){
               System.out.println("this is an isosceles triangle");
           }
           else {
               System.out.println("this is an scalene triangle");
           }
        }
        else {
            System.out.println("the triangle is not an valid triangle");
        }
    }


}
