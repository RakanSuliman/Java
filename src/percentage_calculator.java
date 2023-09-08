import java.util.Scanner;
public class percentage_calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        double number = input.nextDouble();

        System.out.println("Enter percentage:");
        float percentage = input.nextFloat();

        float result = (float) (number) * ( percentage/100 );
        System.out.println(result);
    }

    }
