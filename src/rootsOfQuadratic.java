import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;
public class rootsOfQuadratic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input a: ");
        double a = input.nextDouble();
        System.out.println("Input b: ");
        double b = input.nextDouble();
        System.out.println("Input c: ");
        double c = input.nextDouble();


        double discriminant = b*b-4*a*c;
        double equalZ = -b/(2*a);
        if (discriminant>0) {
           double root1 = -b+Math.sqrt(discriminant)/(2*a);
            double root2 = -b-Math.sqrt(discriminant)/(2*a);
            System.out.println("1= " + root1);
            System.out.println("1= " + root2);
        } else if (discriminant==0) {

           System.out.println("2= " + equalZ);

        } else if (discriminant<0) {
            double real = equalZ;
            double imagin1 = Math.sqrt(-discriminant)/(2*a);
            double imagin2 = Math.sqrt(+discriminant)/(2*a);

            System.out.println("3= " + imagin1);
            System.out.println("3= " + imagin2);
            System.out.println("3= " + real);


        }


    }
}
