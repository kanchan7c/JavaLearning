public class PositiveNgative {
    public static void main(String[] args){
        checkNumber(7);
    }
    public static void checkNumber(int number){
       if (number > 0){
           System.out.println("Positive");
       } else if (number < 0){
           System.out.println("Negative");
       } else {
           System.out.println("Zero");
       }
    }
}
