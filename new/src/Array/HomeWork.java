package Array;
public class HomeWork {
    public static void main(String[] args) {
        int[] oddNum = new int[50];
        int n = 0;

        // Loop through numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            // Check if the number is odd
            if (i % 2 != 0) {
                // If odd, add it to the array
                oddNum[n] = i;
                n++;
            }
        }

        // Print the odd numbers stored in the array
        System.out.println("Odd numbers from 1 to 100:");
        for (int x : oddNum) {
            System.out.println(x);
        }
    }
}

//        int oddNum[] = new int[50];
//        int  n = 0;
//        for (int i =1 ; i<=100; i++) {
//            if (i / 2 != 0) {
//                oddNum[n] = i;
//                n++;
//            }
//        }
//        for (int x: oddNum){
//            System.out.println(x);
//        }
//    static void cityNames(){
//        Scanner sc = new Scanner(System.in);
//        String c[] = new String[6];
//
//        for (int i=0; i<c.length;i++){
//
//            System.out.println("Enter the country no. :\t "+(i));
//            c[i] = sc.next();
//        }
//        for(String x : c){
//            System.out.println(x);
//        }
//    }