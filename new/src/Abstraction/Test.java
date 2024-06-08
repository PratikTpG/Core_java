package Abstraction;



public class Test {
    public static void main(String[] args) {
        CentralBank cb = new PrabhuBank();

        cb.getBankName();
        cb.getInterestRate();

        UserServices us = new UserInterfaceImpl();
        us.addUser();
        us.deleteUser();
        us.print();

//
//        CommonService cs = new UserInterfaceImpl()
//                cs.print();
    }
}
