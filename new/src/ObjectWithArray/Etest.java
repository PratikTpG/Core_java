package ObjectWithArray;

import java.util.Scanner;

public class Etest {
    public static void main(String[] args) {
        Employee employee[] = new Employee[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0 ; i<employee.length ; i++) {
            Employee e = new Employee();

            System.out.println("Enter ID : ");
            e.setId(sc.nextInt());
            System.out.println("Enter City : ");
            e.setCity(sc.next());
            System.out.println("Enter Name : ");
            e.setName(sc.next());
            System.out.println("Enter Company : ");
            e.setCompany(sc.next());
            System.out.println("Enter Post");
            e.setPost(sc.next());
            System.out.println("Enter  department");
            e.setDepartment(sc.next());
            System.out.println("Enter Salary");
            e.setSalary(sc.nextInt());
             e = employee[i];
        }
         int c = 0;
        for (Employee e : employee){
            if(e.getDepartment().equals("IT"));
            c++;
        }

    }
}
