package ATM;

public class Screen {
    void getCmd(){
        System.out.println("Enter 1 for Balance Inquiry");
        System.out.println("Enter 2 for Cash Withdrawl");
        System.out.println("Enter 3 for Deposit");
    }
    void BlcChk(){
        System.out.println("Your available balance is : ");
    }

    void Wthdrwl(){
        System.out.println("Enter the amount you want to withdraw : ");
    }

    void Dpst(){
        System.out.println("Enter the amount you want to deposit : ");
    }
}
