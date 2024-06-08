package ObjectWithArray;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Store the data of 5 student

        //create array
        Student student[] = new Student[5];

        //write data in array
        Scanner sc = new Scanner(System.in);
         for (int i=0; i<student.length; i++) {

             Student s1 = new Student();

             System.out.println("enter first name");
             s1.setFname(sc.next());

             System.out.println("enter last name");
             s1.setLname(sc.next());

             System.out.println("enter age");
             s1.setAge(sc.nextInt());

             System.out.println("enter college");
             s1.setCollege(sc.next());

             System.out.println("enter id");
             s1.setId(sc.nextInt());

             System.out.println("enter city");
             s1.setCity(sc.next());

             student[i] = s1;
         }

         //read data from array

        for(Student s1 :student){

            System.out.println(s1);
        }

    }
}
