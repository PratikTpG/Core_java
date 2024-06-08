package ControlStatements;

import java.util.Scanner;

public class Si {
    public static void main(String[] args) {
        int p ;
        int r ;
        int t ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principle amount");
        p = sc.nextInt();

        System.out.println("Enter the rate of interest");
        r= sc.nextInt();

        System.out.println("Enter the time");
        t= sc.nextInt();
        int si;
        if (p != 0 && t != 0 && r!=0)
        {
            si= p*t*r/100;

            System.out.println("Simple intrest = \t" + si);
        }
        else {
            System.out.println("Invalid VAlues");
        }


    }
}
