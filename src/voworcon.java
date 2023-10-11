import java.util.Scanner;
public class voworcon {
    public static void main(String[] args) {
        System.out.println("Enter a letter: ");
        Scanner input = new Scanner(System.in);
        String letter = input.nextLine();
        char c = letter.charAt(0);


        if (Character.isLetter(c)) {
            switch (Character.toLowerCase(c)) {
                case 'a':
                case 'i':
                case 'o':
                case 'u':
                case 'e':
                    System.out.println(c + " is a vowel");
                    break;
                default:
                    System.out.println(c + " is a consonant");
            }
        } else {
            System.out.println(c + " is an invalid input");
        }
    }
}
