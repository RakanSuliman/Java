import java.util.Scanner;
public class NODM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a month: ");
        String month = input.nextLine();

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        int days;

        switch (month.toLowerCase()) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
            days=31;
break;
            case "april":
            case "june":
            case "september":
            case "november":
                days=30;
                break;
            case "february":

                if (year%4 ==0 && year%100!=0 || (year%400==0)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                System.out.println("Invalid month");
                return;
        }

        System.out.println(year + " has " + days + " days in " + month );
    }
}
