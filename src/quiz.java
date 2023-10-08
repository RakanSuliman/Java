import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Basic Math quiz!");
        System.out.println("What is square root of 25?");
        int sqrRoot25 = input.nextInt();
        System.out.println("What is 25*2+2?");
        int multi1 = input.nextInt();
        System.out.println("(x-9)^2 ");
        int diffSqr = input.nextInt();
        System.out.println("7+7-7*(2+1)");
        int multiAndAdd = input.nextInt();
        System.out.println("1+1");
        int hardQuestion = input.nextInt();
        System.out.println("x-3=9, x is?");
        int whatIsX = input.nextInt();

        int correctAnswer = 0;

        if (sqrRoot25 == 5) {
            System.out.println("Correct!");
            correctAnswer++;
        } else {
            System.out.println("Wrong!");
        }
        if (multi1 == 52) {
            System.out.println("Correct!");
            correctAnswer++;

        }  else {
            System.out.println("Wrong!");
        }
        if (diffSqr == 3) {
            System.out.println("Correct!");
            correctAnswer++;
        } else {
            System.out.println("Wrong!");
        }
        if (multiAndAdd == -7) {
            System.out.println("Correct!");
            correctAnswer++;
        } else {
            System.out.println("Wrong!");
        }
        if (hardQuestion == 2) {
            System.out.println("Correct!");
            correctAnswer++;
        } else {
            System.out.println("Wrong!");
        }
        if (whatIsX == 12) {
            System.out.println("Correct!");
            correctAnswer++;
        } else {
            System.out.println("Wrong!");
        }

        int totalQuestions = 6;
        double percentage = (correctAnswer / (double) totalQuestions) * 100;

        System.out.println("\t You've answered " + correctAnswer + "\tout of " + totalQuestions + "\t questions correctly.");
        System.out.println("\t Your grade: " + percentage + "%");

        if (percentage>95) {
            System.out.println("\tYour Grade A+");
        } else if (percentage >= 90 && percentage < 95) {
            System.out.println("\tYour Grade A");
        } else if (percentage >= 85 && percentage < 90) {
            System.out.println("\tYour Grade B+");
        } else if (percentage >= 80 && percentage < 85) {
            System.out.println("\tYour Grade B");
        } else if (percentage >= 75 && percentage < 80) {
            System.out.println("\tYour Grade C+");
        } else if (percentage >= 70 && percentage < 75) {
            System.out.println("\tYour Grade C");
        } else if (percentage >= 65 && percentage < 70) {
            System.out.println("\tYour Grade D+");
        } else if (percentage >= 60 && percentage < 65) {
            System.out.println("\tYour Grade D");
        } else if (percentage >= 0 && percentage < 60) {
            System.out.println("\tYour Grade F");
        } else {
            System.out.println("\tError, try again");
        }

    }
}
