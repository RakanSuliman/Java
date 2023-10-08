import java.util.Scanner;
public class hexagonArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the length of a side of the hexagon: ");
        double side = input.nextDouble();
     double frac = 3*Math.sqrt(3)/2;
     double FofHex = frac*Math.pow(side,2);
        System.out.println("The area of the hexagon is: " + FofHex);
    }
}

//  double frac = 3*Math.sqrt(3)/2;
//        double FofHex = frac*side*side;