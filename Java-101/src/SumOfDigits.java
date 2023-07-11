import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        int number, digit, digitvalue, sum = 0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number : ");
        number = inp.nextInt();

        while (number != 0) {

            digitvalue = number % 10;

            number = number / 10;

            sum += digitvalue;
        }
        System.out.println(sum);

    }
}
