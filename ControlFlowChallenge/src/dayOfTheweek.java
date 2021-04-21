public class dayOfTheweek {
    public static void printDayOfTheWeek(int day){
        switch (day){
            case 1:
                System.out.println("Day of the Week is Sunday"); break;
            case 2:
                System.out.println("Day of the Week is Monday"); break;
            case 3:
                System.out.println("Day of the Week is Tuesday"); break;
            case 4:
                System.out.println("Day of the Week is Wednesday"); break;
            case 5:
                System.out.println("Day of the Week is Thursday"); break;
            case 6:
                System.out.println("Day of the Week is Friday"); break;
            case 7:
                System.out.println("Day of the Week is Saturday"); break;
            default:
                System.out.println("Invalid value! Enter a number between 1 - 7"); break;
        }
    }

    public static void main(String[] args) {
        for(int i=1; i<=7;i++) {
            printDayOfTheWeek(i);
        }
    }
}
