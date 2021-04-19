public class bytesChallenge {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(5000);
    }
    public static void printMegaBytesAndKiloBytes (int kilobytes){
        if (kilobytes < 0){
            System.out.println("Invalid Value");
        } else {
            int convertedResult = kilobytes / 1024;
            int remainingKBs = kilobytes % 1024;
            System.out.println(kilobytes + " KB = "+convertedResult+" MB and " +remainingKBs+ " KB");
        }
    }
}
