import java.util.Scanner;
public class byOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();



 int temp;
        if (num1>num2) {
             temp = num1;
             num1=num2;
             num2=temp;
        }
        if (num2>num3) {
            temp = num2;
            num2=num3;
            num3=temp;
        }

        if (num1>num2) {
            temp = num1;
            num1=num2;
            num2=temp;
        }



        System.out.println("Numbers in ascending order: " + num1 + ", " + num2 + ", " + num3);
    }
}
