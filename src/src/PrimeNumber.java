//19/11/2024
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //user input
        System.out.print("enter the value on n:");
        int n = sc.nextInt();
        System.out.println("prime number from 1 to n" + n + "are:");
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            //check the current number is prime or not
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;//exit loop

                }
            }
            if (isPrime) {
                System.out.println(i + " ");
            }
        }

    }
}
