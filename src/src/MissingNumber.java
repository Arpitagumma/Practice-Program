public class MissingNumber {

        public static void main(String[] args) {
            int[] arr = {1, 2, 4, 6, 3, 7, 8}; // Example array
            int n = arr.length + 1; // Total numbers should be array size + 1

            // Calculate the expected sum of numbers from 1 to n
            int expectedSum = n * (n + 1) / 2;

            // Calculate the actual sum of the array
            int actualSum = 0;
            for (int num : arr) {
                actualSum += num;
            }

            // Find the missing number
            int missingNumber = expectedSum - actualSum;

            System.out.println("The missing number is: " + missingNumber);
        }
    }


