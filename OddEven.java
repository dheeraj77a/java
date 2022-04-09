import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        if(isEven(n))
        System.out.println(n+" is Even");
        else 
        System.out.println(n+"is odd");


        sc.close();

    }

    public static boolean isEven(int n) {
        if((n&1) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
