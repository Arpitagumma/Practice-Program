public class ReturnOddNumber {
    public static void main(String[] args) {
        int[] numbers={4,8,7,2,43,78};
        System.out.println("odd numbers in array");
        for(int num:numbers){
            if(num%2!=0){
                System.out.println(num+ " ");
            }
        }
    }
}
