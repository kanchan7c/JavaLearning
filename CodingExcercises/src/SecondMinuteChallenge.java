public class SecondMinuteChallenge {
    public static String getDurationString(int minutes, int seconds){
        if((minutes >=0) && (seconds >= 0 && seconds <= 59)){
            return ("Invalid Value");
        }else {
            int totalSeconds = minutes * 60;
            totalSeconds += seconds;
            int hours = totalSeconds / 3600;
            int mins = totalSeconds % 60;
            int secs = mins % 3600;
            return (hours +"h "+mins+"m "+secs+"s");
        }
    }
    public static String getDurationString(int seconds){
        if(seconds >= 0) {
            int mins = seconds / 60;
            return getDurationString(mins, seconds);
        }
        else {
            return ("Invalid Value");
        }
    }
    public static void main(String[] args) {
        System.out.println(getDurationString(61,60));
        System.out.println(getDurationString(60));
    }
}
