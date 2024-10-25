public class SumOfElements {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 45, 78, 99}; //initialize the array with elements
  //variable store to the element
        int sum=0;
        for(int i=0;i<numbers.length;i++){ //loop through the array
            sum+=numbers[i];//add each element to sum
//        for (int num : numbers) {
//            sum+=num;
        }
        System.out.println("sum of  array elements:"+sum);//print total sum

    }
}
