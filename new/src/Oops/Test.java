package Oops;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        //Math Book
        Scanner sc = new Scanner(System.in);

        Books b = new Books();
        System.out.println("Enter the name of the book");
        b.name= sc.toString();

        System.out.println("Enter the author of the book");
        b.author= sc.toString();

        System.out.println("Enter the price of the book");
        b.price= sc.nextInt();

        System.out.println("Enter the number of pages in the book");
        b.pages= sc.nextInt();

        b.printBookInfo();


    }
}
