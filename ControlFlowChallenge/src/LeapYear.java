public class LeapYear {
    public static boolean isLeapYear(int year){
        if((year <=1) || (year >=9999)){
            return false;
        }
        else {
            return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
        }
    }
    public static int getDaysInMonth(int month, int year){
        if((month <1 || month >12)||(year < 1 || year > 9999)) {
            return -1;
        }
        if(isLeapYear(year) && month == 2){
            return 29;
        }
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 2:
                return 28;
            default:
                return 30;
        }
    }

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(2,2000));
        System.out.println(isLeapYear(2000));
    }
}
