package ATM;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        BankDatabase b = new BankDatabase();
        Scanner sc = new Scanner(System.in);
        Screen s = new Screen();
        s.getCmd();
        int x;
        int n;

        n = sc.nextInt();
        switch (n){
            case 1:

                s.BlcChk();
                  break;
            case 2:
                s.Wthdrwl();
                x = sc.nextInt();
                break;

            case 3:
                s.Dpst();
                x = sc.nextInt();
                break;
        }

    }
}
