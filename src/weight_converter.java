import java.util.Scanner;
public class weight_converter {
    public static void main(String[] args) {
      //  Step1: Specify the inputs >> declare constant
        final float converter = 0.45359237f;
        // declare var >> create scanner object

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the weight in pound: ");
        double lb = input.nextDouble();

        // step 2: specify the process

        float kg = (float) (converter * lb);
        // step3 : specify the output
        System.out.println("The weight in kg " + kg + "kg");
    }

}

