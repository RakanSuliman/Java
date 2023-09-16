import java.util.Scanner;
public class circle {
    public static void main(String[] args) {
        double PI = 3.14159;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius value");
        double radius = input.nextDouble();
        if (radius <= 0) {
            System.out.println("Error, only positive numbers allowed");
        } else if (radius > 0) {
            double perimeter  = 2 * (PI * radius);
            double area = (PI * radius * radius);
            System.out.println("The area of a circle is: " + area + "\n" + "The perimeter of circle is: " + perimeter );
        }
    }
}