import java.util.Scanner;
public class RQE {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input a");
        double a = input.nextDouble();
        System.out.println("Input b");
        double b = input.nextDouble();
        System.out.println("Input c");
        double c = input.nextDouble();

        double discriminant = Math.pow(b, 2) - 4 * (a * c);
        double underRoot = Math.pow(b, 2) - 4 * a * c;
        double sqrRoot = Math.sqrt(underRoot);
        double forImagn = -b / (2 * a);
        if (discriminant > 0) {
            double root1 = (-b + sqrRoot) / (2 * a);
            double root2 = (-b - sqrRoot) / (2 * a);
            System.out.println("The quadratic equation has two distinct real roots: " + root1 + " and " + root2);

        } else if (discriminant == 0) {
            double root3 = -b / (2 * a);
            System.out.println("The quadratic equation has one real root: " + root3);

        } else if (discriminant < 0) {
            double realpart = forImagn;
            double root4 = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("The quadratic equation has two complex roots: " + realpart + " + " + root4 + "i and " + realpart + " - " + root4 + "i");


        }
    }
}
