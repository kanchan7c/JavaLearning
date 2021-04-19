public class ChallengeOperators {
    public static void main(String[] args) {
          double num1 = 20d , num2 = 80d;
         double result = (num1 + num2) *100;
         double Remainder = result % 40d;
        boolean result2;
         if (Remainder == 0) {
             result2 = true;
             System.out.println("Reaminder is zero therefore it is " + result2);
         }
         else {
             result2 = false;
             System.out.println("Got the remainder " + Remainder);
         }
    }
}
