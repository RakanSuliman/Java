import java.util.Scanner;
public class Time {
    public static void main(String[] args) {
        final long  min = 60;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Seconds");
        long  sec = input.nextLong();

        long  sec_to_min = (sec/min);
        double  remain = sec%min;
        System.out.println(sec_to_min + " MIN " + remain + " SEC");

    }
}
