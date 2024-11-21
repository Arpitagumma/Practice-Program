//19/11/24
import java.util.Scanner;

public class MultiplyFloatingPoint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter 1st floating point: ");
        float num1=sc.nextFloat();
        System.out.print("enter 2nd floating point: ");
        float num2=sc.nextFloat();
        float res=num1*num2;
        //display res
        System.out.println("res of multiply" +num1+ "and" +num2+ "is" +res);
    }
}
