public class SecondMinuteChallenge {
    public static String getDurationString(long minutes, long seconds){
        if((minutes >=0) && (seconds >= 0 && seconds <= 59)){
            return ("Invalid Value");
        }else {
            long totalSeconds = minutes * 60;
            totalSeconds += seconds;
            long hours = totalSeconds / 3600;
            long mins = totalSeconds % 60;
            long secs = mins % 3600;
            return (hours +"h "+mins+"m "+secs+"s");
        }
    }
    public static String getDurationString(long seconds){
        if(seconds >= 0) {
            long mins = seconds / 60;
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
