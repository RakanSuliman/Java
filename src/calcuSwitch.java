import java.util.Scanner;
public class calcuSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, %): ");
        char operator = input.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1+num2;
                        break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero");
                    return;
                }
                break;
            case '%':
                result = num1%num2;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);


    }
}
