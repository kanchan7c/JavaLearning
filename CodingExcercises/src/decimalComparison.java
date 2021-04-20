public class decimalComparison {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int number1 = (int) (num1 * 1000);
        int number2 = (int) (num2 * 1000);
        return ((number1 - number2) == 0);
    }

    public static void main(String[] args) {
        boolean result = areEqualByThreeDecimalPlaces(459.8798,459.8799);
        System.out.println(result);
    }
}
