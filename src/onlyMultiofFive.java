import java.util.Scanner;

public class onlyMultiofFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        if (num != 0) {
            if (num % 5 == 0)
                System.out.println("It's multiple of 5");
            else  if (num % 2 == 0)
                System.out.println("GOOD EVEN");
            else
            System.out.println("Error, try again");
        }  else
                System.out.println("Error, try again!");

    }
}

