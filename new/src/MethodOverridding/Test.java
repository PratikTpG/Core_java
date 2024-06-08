package MethodOverridding;

public class Test {
    public static void main(String[] args) {

        //static or early binding of object
        PrabhuBank pb = new PrabhuBank();
        pb.getBankName();
        pb.getInterestRate();

        //up-casting
        CentralBank nabil = new NabilBank();
        nabil.getBankName();
        nabil.getInterestRate();

        printBankInfo(pb);
    }
    //late or dynamic binding of an object
    //run-time polymorphism
    static void printBankInfo(CentralBank b){
        b.getBankName();
        b.getInterestRate();
    }
}
