public class SumevenNumber {
    public static void main(String[] args) {
        int[] numbers={4,6,24,66};
        int evenSum=0;
        for(int num:numbers){
            if(num%2==0){
                evenSum+=num;
            }
        }
        System.out.println("sum of the number:"+evenSum);
    }
}
