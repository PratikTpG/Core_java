package Inheritance;

public class Test {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.name="Birendra";
        p.age = 22;
        p.salary= 200_000;
        p.company="space-x";
        p.bonus=22003;
        p.progLang= "java";
        p.project="Tinder";

        p.print();
    }

}
