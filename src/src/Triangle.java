//14/11/2024
public class Triangle {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {  //for rows
            for (int j = i; j <= rows; j++) {
                System.out.print(" ");//printing space
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");//printing star
            }
            System.out.println();
        }
    }
}

//public class Triangle{
//    public static void main(String[] args) {
//        int rows = 5; // Number of rows in the triangle
//
//        for (int i = 1; i <= rows; i++) {
//            // Print spaces for alignment
//            for (int j = i; j < rows; j++) {
//                System.out.print(" ");
//            }
//            // Print stars for the triangle pattern
//            for (int k = 1; k <= (2 * i - 1); k++) {
//                System.out.print("*");
//            }
//            System.out.println(); // Move to the next line after each row
//        }
//    }
//}

