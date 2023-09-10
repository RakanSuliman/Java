import java.util.Scanner;
public class sales_tax {
    public static void main(String[] args) {
  //  final float taxRate = 15f;

    Scanner input = new Scanner(System.in);
    System.out.println("Enter Tax Rate(5,10,15):");
        int taxRate = input.nextInt();
    System.out.println("Enter the purchase amount");
            double purchaseAmount = input.nextDouble();

    float taxAfter = (float)(purchaseAmount * (taxRate / 100.0f));
    System.out.println("tax total amount after adding the tax rate is " + taxAfter);
    }
}
