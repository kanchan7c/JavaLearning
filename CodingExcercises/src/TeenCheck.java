public class TeenCheck {
    public static boolean hasTeen(int num1, int num2, int num3){
        return ((num1 >= 13 && num1 <=19) || (num2 >= 13 && num2 <=19)||(num3 >= 13 && num3 <=19));
    }
    public static boolean isTeen(int num4){
        return (num4 >= 13 && num4 <=19);
    }
}
