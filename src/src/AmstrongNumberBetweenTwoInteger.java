import java.util.Scanner;

public class AmstrongNumberBetweenTwoInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st number");
        int num1 = sc.nextInt();
        System.out.print("enter 2nd number");
        int num2 = sc.nextInt();
        //find amstrong number in range
        for (int num = num1; num <= num2; num++) {
            int sum = 0, originalNumber = num;

            //calculate sum of raised digit
            while (num > 0) {
                int digit = num % 10; //get thelast digit
                sum += digit * digit * digit;  //add cube of the digit
                num /= 10;
            }
            if (sum == originalNumber) {
                System.out.println(originalNumber);
            }
            num = originalNumber;
        }

    }
}
