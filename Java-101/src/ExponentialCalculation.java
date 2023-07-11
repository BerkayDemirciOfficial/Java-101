import java.util.Scanner;

public class ExponentialCalculation {

    public static void main(String[] args) {

        int user, n, i, product = 1;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        user = inp.nextInt();

        System.out.print("Enter a Exponent of the Number: ");
        n = inp.nextInt();


        for (i = 1; i <= n; i++) {

            product *= user;

        }

        System.out.println(user + "^" + n + " : " + product);


    }
}
