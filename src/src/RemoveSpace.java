
//20/11/24
import java.util.Scanner;

public class RemoveSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string: ");
        String input=sc.nextLine();
        String res=input.replaceAll("\\s","");
        System.out.println("string without space:" +res);
    }
}
