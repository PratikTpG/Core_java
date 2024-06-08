package Homework2;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter the value you want to multiply:");
        a= sc.nextInt();

        System.out.println("the given number is: "+a);

        for (int i=1; i<=10; i++){
            System.out.println(a +"x"+i+"="+(a*i));
        }

    }
}
