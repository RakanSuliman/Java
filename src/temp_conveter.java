import java.util.Scanner;
public class temp_conveter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit");
            double F = input.nextDouble();

        double convert = (5.0 / 9.0) * (F - 32);
            System.out.println("The temperature in Celsius is:" + convert);
    }

}
