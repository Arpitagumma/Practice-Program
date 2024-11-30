import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // Input array size
            System.out.println("Enter the size of the array:");
            int size = sc.nextInt();

            // Declare the array
            int[] array = new int[size];

            // Input array elements
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }

            // Input element to count
            System.out.println("Enter the element to count:");
            int element = sc.nextInt();

            // Count occurrences
            int count = 0;
            for (int i = 0; i < size; i++) {
                if (array[i] == element) {
                    count++;
                }
            }

            // Output the result
            System.out.println("The element " + element + " appears " + count + " times in the array.");
        }
    }



