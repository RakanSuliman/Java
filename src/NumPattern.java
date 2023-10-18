public class NumPattern {
    public static void main(String[] args) {

        int i,j;
        int number = 1;
        for (i = 1; i<=5; ++i) {
            for (j=1; j<=i; ++j) {

                System.out.print(number+ " ");
                number++;
            }

            System.out.println();
        }
    }
}