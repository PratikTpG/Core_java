package Encapsulation;

public class Test {
    public static void main(String[] args) {
        Customer c = new Customer();

       c.setName("Ram");
       c.setAge(22);
       c.setCity("lalitpur");
       c.setPhone(226819);


        System.out.println(c);
//        System.out.println("Name : "+c.getName());
//        System.out.println("Age : "+c.getAge());
//        System.out.println("City : "+c.getCity());
//        System.out.println("Phone : "+c.getPhone());

    }
}
