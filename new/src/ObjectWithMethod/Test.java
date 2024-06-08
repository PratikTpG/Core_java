package ObjectWithMethod;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        Product pd = t.getProductData();
       t.printProduct(pd);
    }
        //-------------Object as Parameter---------------
        void printProduct(Product p){
            System.out.println("ID : "+p.getId());
            System.out.println("Name : "+p.getName());
            System.out.println("Price : "+p.getPrice());
            System.out.println("Company : "+p.getCompany());
        }
        //-------------Object as return type-------------
        Product getProductData(){
        Product p = new Product();
            Scanner sc = new Scanner(System.in);
            System.out.println("enter id : ");
            p.setId(sc.nextInt());

            System.out.println("enter name : ");
            p.setName(sc.next());

            System.out.println("enter company : ");
            p.setCompany(sc.next());

            System.out.println("enter price : ");
            p.setPrice(sc.nextInt());
            return p;
        }

        //-----------------Array of object as parameter---------------

        //-----------------Array of object as a return type----------------
}
