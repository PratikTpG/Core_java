package Method;

import java.util.Scanner;

public class Methodtest {


    public static void main(String[] args) {

//        System.out.println("enter a number");
//
//        int sv =findSmallest(300 , 400);
//        System.out.println(+sv);
        printTable(8);
//        int s = getSumOf1to100();
//        System.out.println("the sum of 1 to 100 is "+s);
//        area();
    }

    //1. No-return Type With No Arguments
     static void add(){
        int x = 299;
        int y = 29;

        int s= x+y;
        System.out.println("the sum of x and y is \t" +s);
    }

    static void area(){

        Scanner sc = new Scanner(System.in);
        int l ;
        System.out.println("Enter the value of l");
        l = sc.nextInt();

        int b ;
        System.out.println("Enter the value of b");
        b = sc.nextInt();

        int a= l * b;

        System.out.println("The area of l and b = " +a);
    }

    //2. No-return Type with arguments
     static void printTable(int n){

        for (int i=1; i<=10 ; i++){
            System.out.println(n +"x"+i+"="+ (n+i));
        }
    }

    //3. Return Type with no arg

    static int getSumOf1to100(){
        int s=0;
        for (int i=1; i<=100; i++){
            s= s+i;
        }
        return s;
    }
    //4. Return with Arguments
   static   int findSmallest(int a, int b){

        if (a<b){
            return a;
        }
        else {
            return b;
        }

    }



}
