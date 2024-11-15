//14/11/24
public class DiamondPattern {
    public static void main(String[] args) {
        int rows=5;
        //top half diamond
        for(int i=1;i<=rows;i++){ //rows
            for(int j=i;j<rows;j++){ //spaces
                System.out.print(" ");

            }
            for(int k=1;k<=(2*i-1);k++){ //star
                System.out.print("*");
            }
            System.out.println();

        }

        //bottom half
        for(int i=rows-1;i>=1;i--){
            for(int j=rows;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
