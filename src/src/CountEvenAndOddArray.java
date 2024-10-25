public class CountEvenAndOddArray {
    public static void main(String[] args) {
        int[] numbers={7,3,8,2,9,45,87};//initialize the array
        int evenCount=0;
        int oddCount=0;
        for(int num:numbers) {
            if (num % 2 == 0) {
                evenCount++;

            } else {
                oddCount++;
            }

        }
        System.out.println("number of even number:" +evenCount);
        System.out.println("number of even number:" +oddCount);
    }
}

