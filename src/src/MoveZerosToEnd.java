public class MoveZerosToEnd {

        public static void main(String[] args) {
            int[] arr = {0, 1, 0, 3, 12}; // Example array

            int index = 0; // Keeps track of the position for non-zero elements

            // Step 1: Move all non-zero elements to the front
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    arr[index] = arr[i];
                    index++;
                }
            }

            // Step 2: Fill the rest of the array with zeros
            while (index < arr.length) {
                arr[index] = 0;
                index++;
            }

            // Print the modified array
            System.out.println("Modified Array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }


