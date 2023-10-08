import java.util.Scanner;
public class currencyConverter {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter an amount in Saudi Riyals (SAR): ");
        double SAR = input.nextDouble();
        final double USD = 0.26666667*SAR;
        final double EUR = 0.25185748*SAR;
        final double GBP = 0.21858995*SAR;
        final double RUB = 25.732956*SAR;
        final double AED = 0.97933333*SAR;
        final double CHF = 0.2440926*SAR;
        final double JPY = 39.830576*SAR;
        final double AUD = 0.41450925*SAR;
        final double BHD = 0.10026667*SAR;

        System.out.println(SAR + " SAR " + "converted to " + "\n" + "USD: " +  USD
                + "\n" + "Euro (EUR): " +  EUR
                + "\n" + "Pound Sterling (GBP): " +  GBP
                + "\n" + "Russian Ruble (RUB): " +  RUB
                + "\n" + "UAE Dirham (AED): " +  AED
                + "\n" + "Swiss Franc (CHF): " +  CHF
                + "\n" + "Japanese Yen (JPY): " +  JPY
                + "\n" + "Australian Dollar (AUD): " +  AUD
                + "\n" + "Bahrain Dinar (BHD): " +  BHD);

    }
}
