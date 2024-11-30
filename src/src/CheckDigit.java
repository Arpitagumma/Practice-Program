public class CheckDigit {
    public static void main(String[] args) {
        String input="12345";
        if(input.matches("\\d+")){
            System.out.println("String contains digit");
        } else{
            System.out.println("String does not contains digits");
        }
    }

}
