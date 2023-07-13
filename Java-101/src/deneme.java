
import java.util.Scanner;

public class deneme {

    public static void main(String[] args) {

        int user;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a star number : ");
        user = inp.nextInt();

        for (int k = 1; k <= user; k++) {

            System.out.print("*");
        }

    }
}
