package Homework2;

import java.util.Scanner;

public class SumtoNth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s;
        System.out.println(" enter the nth number to sum to: ");
        s = sc.nextInt();

        int ad;

            for (int i=1; i<=s; i++){
                ad= i + (i-1);
                System.out.println(ad);}
    }
}
