package MethodOverridding;

public class RadheBank extends CentralBank {

    @Override
    void getBankName() {
        System.out.println("Radhe Bank");
    }

    @Override
    void getInterestRate() {
        System.out.println("8");
    }
}
