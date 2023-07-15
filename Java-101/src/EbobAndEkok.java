import java.util.Scanner;

public class EbobAndEkok {

    public static void main(String[] args) {

        int number1, number2, greatestCommonDivisor = 0;

        Scanner inp = new Scanner(System.in);

        System.out.print("1. Great Number : ");
        number1 = inp.nextInt();

        System.out.print("2.Small Number : ");
        number2 = inp.nextInt();


        for (int i = 1; i <= number1 && i <= number2; i++) {

            if (number1 % i == 0 && number2 % i == 0)

                greatestCommonDivisor = i;
        }

        System.out.println("Greatest common divisor " + number1 + " and " + number2 + " : " + greatestCommonDivisor);

        int leastCommonMultiple = (number1 * number2) / greatestCommonDivisor;

        System.out.print("Least common multiple " + number1 + " and " + number2 + " : " + leastCommonMultiple);


    }
}
