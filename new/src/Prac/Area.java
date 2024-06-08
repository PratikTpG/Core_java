package Prac;

import java.util.Scanner;

public class Area {
    int l;
    int b;
     void setDim(int len, int bre){
        l = len;
        b = bre;
    }
    void getArea(){
         int a = l*b;
        System.out.println("The area = "+a);
    }

    public static void main(String[] args) {
        Area a = new Area();
        Scanner sc = new Scanner(System.in);

        int l;
        System.out.println("Enter the length : ");
        l = sc.nextInt();
        int b;
        System.out.println("Enter the Breadth : ");
        b = sc.nextInt();

        a.setDim(l,b);
        a.getArea();
    }
    }
