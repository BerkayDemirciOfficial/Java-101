import java.util.Scanner;

public class DiamondWithStars {

    public static void main(String[] args) {

        int user;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a star number : ");
        user = inp.nextInt();

        for (int i = 1; i <= user; i++) {

            for (int j = 1; j <= (user - i); j++) {

                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {

                System.out.print("*");
            }


            System.out.println();

        }

        for (int i = user - 1; i > 0; i--) {

            for (int j = 1; j <= (user - i); j++) {

                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {

                System.out.print("*");
            }

            System.out.println(i);

        }

    }
}
