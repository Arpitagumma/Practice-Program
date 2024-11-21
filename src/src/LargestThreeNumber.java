//19/11/24
import java.util.Scanner;

public class LargestThreeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter 1 st number");
        int num1=sc.nextInt();
        System.out.print("enter 2nd number");
        int num2=sc.nextInt();
        System.out.print("enter 3rd number");
        int num3=sc.nextInt();
        int largest=num1;
        if(num2>largest){
            largest=num2;

        }
        if(num3>largest){
            largest=num3;
        }
        System.out.println("largest number is: " +largest);
    }
}
