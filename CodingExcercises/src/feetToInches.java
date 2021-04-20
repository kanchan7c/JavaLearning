public class feetToInches {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet < 0 )|| ((inches < 0) || (inches > 12))){
            return -1;
        }else {
            return ((inches + (feet * 12)) * 2.54);
        }
    }
    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(6, 0) + " cm");
    }
}
