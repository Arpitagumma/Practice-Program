//19/11/24
import java.util.Scanner;

public class LcmOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter  1st number:");
        int num1=sc.nextInt();
        System.out.print("enter  2nd number:");
        int num2=sc.nextInt();
        //initialize lcm to large number
        int Lcm=(num1>num2) ? num1:num2;
        //find lcm
        while(true){
            if(Lcm%num1==0&&Lcm%num2==0){
                System.out.println("the lcm of "+num1+  "and"  +num2+  "is:" +Lcm);
                break;//exit loop once lcm found

            }
            Lcm++;
        }
    }
}
