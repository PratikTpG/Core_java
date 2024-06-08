package Aggregation;

public class Test {
    public static void main(String[] args) {
        Car c = new Car();
        c.setColor("White");
        c.setCompany("Tesla");
        c.setPrice(10000000);

        Employee e = new Employee();
        e.setName("ram");
        e.setId(983928);
        e.setSalary(100000);
        e.setCar(c);

        System.out.println("id = " +e.getId());
        System.out.println("name  = "+ e.getName());
        System.out.println("salary = "+ e.getSalary());
        System.out.println("-------------Car Info------------" );
        System.out.println("Color  = " + e.getCar().getColor());
        System.out.println("Company = " +e.getCar().getCompany());
        System.out.println("Price = " +e.getCar().getPrice());


    }
}
