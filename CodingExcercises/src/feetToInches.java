public class feetToInches {
    public static double calcFeetAndInchesToCentimeters(int feet, int inches){
        if (feet >= 0 && inches >0 && inches <=12){
            return ((inches + (feet * 12)) * 2.54);
        }else {
            return -1;
        }
    }
    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(10, 8) + " cm");
    }
}
