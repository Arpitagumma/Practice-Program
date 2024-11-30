
import java.util.Scanner;
import java.util.ArrayList;
    public class RemoveDuplicates {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input array size and elements
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();
            int[] array = new int[size];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }

            // Remove duplicates using ArrayList
            ArrayList<Integer> uniqueList = new ArrayList<>();
            for (int num : array) {
                if (!uniqueList.contains(num)) {
                    uniqueList.add(num);
                }
            }

            // Output the unique elements
            System.out.println("Array after removing duplicates: " + uniqueList);
        }
    }


