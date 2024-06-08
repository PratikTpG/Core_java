package Method;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {


       int a =  getArea( 30, 40);
        System.out.println(+a);

//        int v = getVolume(40 , 70);

    }
   static int getArea (int l , int b){
        int area = l * b;
        return area;
    }

    static void getVolume (int a , int h){
        int v = a * h ;
        System.out.println("Area is \t" +a);
        System.out.println("volume is \t" +v);

    }


}
