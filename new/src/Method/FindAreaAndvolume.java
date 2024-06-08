package Method;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FindAreaAndvolume {
    public static void main(String[] args) {
//        int a = getArea(40, 50);
//        getVolume(a,50);
//        SiAndAmount();
        input();
    }
    static int getArea (int l , int b){
        int  a = l * b;
        return a;
    }
    static void getVolume (int a, int h){
        int v = a * h;
        System.out.println("Area = \t" +a);
        System.out.println("Volume = \t"+v);

    }
    static void input() {
        Scanner sc = new Scanner(System.in);

        int p ;
        System.out.println("Enter the principle amount: ");
        p = sc.nextInt();

        int t ;
        System.out.println("Enter the time :");
        t = sc.nextInt();

        int r ;
        System.out.println("Enter the rate of interest: ");
        r = sc.nextInt();
        process(p, t, r);


    }

    static void process( int p ,int t , int r){

        int Si = p * t * r/100;
        int a = p + Si;
        output(a,Si);


//        return Si;
    }

    static void output(int a, int Si){

        System.out.println("the Simple interest  is :\t" +Si + "\nthe amount is :\t"+a);

    }

}
