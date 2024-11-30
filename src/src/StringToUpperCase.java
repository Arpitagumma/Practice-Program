import java.util.Scanner;

public class StringToUpperCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        String input=sc.nextLine();
        System.out.println("UpperCase: "+input.toUpperCase());
        System.out.println("LowerCase: "+input.toLowerCase());
    }
}
