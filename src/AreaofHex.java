import java.util.Scanner;
public class AreaofHex {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input the length of a side of the hexagon: ");

        double side = input.nextDouble();
        double p = side * 6;
        double hexagon = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI/6));

        System.out.println("The area of the hexagon is: " + hexagon);
    }
}
