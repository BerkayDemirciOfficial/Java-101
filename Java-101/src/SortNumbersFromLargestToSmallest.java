import java.util.Scanner;

public class SortNumbersFromLargestToSmallest {

    public static void main(String[] args) {

        int number1, number2, number3;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        number1 = inp.nextInt();

        System.out.print("Enter the second number : ");
        number2 = inp.nextInt();

        System.out.print("Enter the third number : ");
        number3 = inp.nextInt();

        if (number1 < number2 && number1 < number3) {

            if (number2 < number3) {

                System.out.print(number3 + " > " + number2 + " > " + number1);

            } else {

                System.out.print(number2 + " > " + number3 + " > " + number1);
            }
        }

        if (number2 < number3 && number2 < number1) {

            if (number1 < number3) {

                System.out.print(number3 + " > " + number1 + " > " + number2);

            } else {

                System.out.print(number1 + " > " + number3 + " > " + number2);
            }
        }

        if (number3 < number2 && number3 < number1) {

            if (number2 < number1) {

                System.out.print(number1 + " > " + number2 + " > " + number3);

            } else {

                System.out.print(number2 + " > " + number1 + " > " + number3);
            }
        }


    }
}