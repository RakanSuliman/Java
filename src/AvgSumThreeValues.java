import java.util.Scanner;
public class AvgSumThreeValues {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number");
        double num1 = input.nextDouble();

        System.out.println("Enter the second number");
        double num2 = input.nextDouble();

        System.out.println("Enter the third number");
        double num3 = input.nextDouble();

        double sum = num1+num2+num3;
        double avg = sum/3;
        System.out.println("Total: " + sum + "  \nAverage: " + avg);

    }
}