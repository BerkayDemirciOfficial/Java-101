
import java.util.Scanner;

public class deneme {

    public static void main(String[] args) {

        int number;

        Scanner inp = new Scanner(System.in);

        number = inp.nextInt();


        if (number % 2 == 1) {

            System.out.print("Weird.");


        } else if (number == 6 || number == 8 || number == 10 || number == 12 || number == 14 || number == 16 || number == 18 || number == 20) {

            System.out.print("Weird.");

        } else {

            System.out.print("Not Weird.");
        }

    }


}
