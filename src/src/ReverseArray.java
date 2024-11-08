public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {5, 8, 2, 4, 7};
        reversedArray(array);
        for (int num : array) {
            System.out.println(num + " ");
        }

    }

    static void reversedArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }


    }
}
