package Level2;

public class Employee {
int s;
int h;
    void getInfo(int salary, int hours){
          s = salary ;
          h = hours;
    }
    void addSal(){

        if(s<=500) {
                 s = s + 10;
        }

    }

    void addSalH(){

        if (h>6){
            s = s+5;
        }


    }
    void printTotal(){
        System.out.println("Totala salary =" +s);
    }

    public static void main(String[] args) {
         Employee e = new Employee();
         e.getInfo(300,7);
         e.addSal();
         e.addSalH();
         e.printTotal();
    }


}
