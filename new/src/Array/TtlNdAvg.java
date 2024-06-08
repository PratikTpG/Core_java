package Array;

import java.util.Scanner;

public class TtlNdAvg {
    public static void main(String[] args) {


        int books[]  = new int[10];

        Scanner sc = new Scanner(System.in);


        for (int i=0; i<10 ; i++){

            System.out.println("Enter the price of the books: ");
            books[i]=sc.nextInt();
        }
        int sum=0;
        for(int x : books){
            System.out.println(x);
             sum =sum + x;
        }

        double avg = 0;
          avg = sum/books.length;
        System.out.println("the avg is "+avg);
    }
}
