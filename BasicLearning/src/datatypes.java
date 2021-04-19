public class datatypes {
    public static void main(String[] args) {
        byte byteNum = 23;
        short shortNum = 2819;
        int intNum = 272892;
        long longNum = 50000L + 10L * (byteNum + shortNum + intNum);
        System.out.println(longNum);
    }
}
