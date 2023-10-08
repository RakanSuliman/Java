import java.util.Scanner;

public class rootsOfQuadratic  {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = input.nextDouble();
        System.out.print("Input b: ");
        double b = input.nextDouble();
        System.out.print("Input c: ");
        double c = input.nextDouble();

        double discriminant = b * b - 4 * a * c;
        double equalZ = -b / (2 * a);

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (discriminant == 0) {
            System.out.println("Equal Roots = " + equalZ);
        } else if (discriminant < 0) {
            double real = equalZ;
            double imaginary1 = Math.sqrt(-discriminant) / (2 * a);
            double imaginary2 = -Math.sqrt(-discriminant) / (2 * a);

            System.out.println("Real Part = " + real);
            System.out.println("Imaginary Part 1 = " + imaginary1);
            System.out.println("Imaginary Part 2 = " + imaginary2);
        }
    }
}
