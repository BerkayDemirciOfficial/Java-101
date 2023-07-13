import java.util.Scanner;

public class HarmonicNumber {

    public static void main(String[] args) {

        double user, sum = 0.0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        user = inp.nextDouble();

        for (int i = 1; i <= user; i++) {

            sum += (1.0 / i);

        }
        System.out.println(sum);

    }
}
