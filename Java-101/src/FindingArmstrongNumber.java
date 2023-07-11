import java.util.Scanner;

public class FindingArmstrongNumber {

    public static void main(String[] args) {

        int number, digitValue, number1, digit = 0, product = 1, sum = 0;


        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        number = inp.nextInt();

        number1 = number;

        while (number1 != 0) {

            number1 = number1 / 10;
            digit++;
        }

        number1 = number;

        while (number1 != 0) {

            digitValue = number1 % 10;

            number1 = number1 / 10;


            product = 1;

            for (int j = 1; j <= digit; j++) {

                product *= digitValue;
            }

            sum += product;
        }

        System.out.println(sum);

        if (sum == number) {
            System.out.print("This number is Armstrong number.");

        } else {
            System.out.print("This number is not Armstrong number.");

        }
    }

}



