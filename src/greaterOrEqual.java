import java.util.Scanner;
public class greaterOrEqual {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        double num1 = input.nextDouble();
        System.out.println("Enter the second number");
        double num2 = input.nextDouble();

        boolean bothEqual = num1 == num2;
        boolean firstGreater = num1 > num2;

        if (bothEqual) {
            System.out.println(num1 + " is equal to " + num2);
        } else if (firstGreater)
            System.out.println(num1 + " is greater than " + num2 + "\n\t" + "Maximum: " + num1 + "\n\t" + "Minimum: " + num2);
        else {
            System.out.println(num2 + " is greater than " + num1 + "\n\t" + "Maximum: " + num2 + "\n\t" + "Minimum: " + num1);
    }
    }
}
