import java.util.Scanner;

public class CombinationCalculation {

    public static void main(String[] args) {

        int n, r, product = 1, product1 = 1, combination, substraction, product2 = 1;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter n : ");
        n = inp.nextInt();

        System.out.print("Enter r : ");
        r = inp.nextInt();


        for (int i = 1; i <= n; i++) {

            product = product * i;
        }

        for (int i = 1; i <= r; i++) {

            product1 = product1 * i;
        }

        substraction = n - r;

        for (int i = 1; i <= substraction; i++) {

            product2 = product2 * i;
        }

        combination = product / (product1 * product2);

        System.out.println("(" + n + "," + r + ")" + " combination : " + combination);
    }
}
