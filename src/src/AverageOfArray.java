public class AverageOfArray {
    public static void main(String[] args) {
        int[] numbers={4,7,9,33,56,89};
        int sum=0;
        for(int num:numbers){
            sum+=num;
        }
        double average=(double)sum/ numbers.length;
        System.out.println("average of given array:"+average);
    }
}
