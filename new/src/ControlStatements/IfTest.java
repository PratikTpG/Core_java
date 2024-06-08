package ControlStatements;

import java.util.Scanner;

public class IfTest {


    public static void main(String[] args) {
        int salary;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Salary");
        salary = sc.nextInt();

        if (salary < 40000){
            salary = salary +5000;
        }

        System.out.println("Your salary is \t" +salary);
    }
    /*----------------if--------------------
    # Syntax
       if(conditon){
       //stements
       }

     */

}

