package Prac;

public class Stdnts {
    String name ;
    String address;
    int roll;
    int phn;


    void printInfo(String name, String address,int roll,int phn){
        System.out.println("Name : "+name+" address : "+address+" Roll : "+roll+" Phone number : "+phn);
    }
    public static void main(String[] args) {
        String n ;
        String a;
        int r;
        int p;

        Stdnts s = new Stdnts();
       n =  s.name= "john";
       r =  s.roll=1;
       a =     s.address="Koteshwor";
       p =     s.phn = 987745678;
        s.printInfo(n,a,r,p);

        Stdnts b = new Stdnts();
        n = b.name="Ram";
        a = b.address= "Balkhu";
        r = b.roll=2;
        p = b.phn = 98774839;
          b.printInfo(n,a,r,p);
    }
}
