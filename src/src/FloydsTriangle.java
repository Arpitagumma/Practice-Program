//14/11/24
public class FloydsTriangle {
    public static void main(String[] args) {
        int rows=5;
        int numbers=1;//starting of triangle
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(numbers +" ");
                numbers++;
            }
            System.out.println();
        }
    }
}
