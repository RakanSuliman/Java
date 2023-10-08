import java.util.Scanner;
public class LeapYearTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = input.nextInt();
boolean isLeap = (year% 4 ==0 && year % 100 != 0 || year % 400 == 0);
        if (isLeap) {
            System.out.println(year + " is leap year? " + isLeap);
        } else {
            System.out.println(year + " is leap year? " + isLeap);
        }
    }
}
