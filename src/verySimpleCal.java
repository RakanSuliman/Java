import java.util.Scanner;
public class verySimpleCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("A very simple Calculator");
        System.out.println("Enter the first number");
        double num1 = input.nextDouble();

        System.out.println("Enter the second number");
        double num2 = input.nextDouble();

        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)" + "\n2. Subtraction (-)" + "\n3. Multiplication (*)" + "\n4. Division (/)");

        int choice = input.nextInt();
        double result = 0;

        if (choice == 1) {
            result = num1 + num2;
        } else if (choice == 2) {
            result = num1 - num2;
        } else if (choice == 3) {
            result = num1 * num2;

        } else if (choice == 4) {
            if (num2 == 0) {
                System.out.println("Error: Division by zero");
                System.exit(1);
            } else {
                result = num1 / num2;
            }
        } else {
                System.out.println("Error, Invalid choice");
                System.exit(1);
        }
            System.out.println("Result: " + result);



    }
}