import java.util.Scanner;
public class salesTax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Purchase amount:");
            double purchaseAmount = input.nextDouble();

        System.out.println("Enter tax const (5,10,15):");
          int taxConst = input.nextInt();

        double tax =  (purchaseAmount) * ( taxConst/100.0 );
        double afterTax = (tax+purchaseAmount);
        System.out.println("Purchase amount before tax: " + purchaseAmount + "\nTax: " + tax + "\nPurchase amount before tax: " + afterTax);
    }
    }
