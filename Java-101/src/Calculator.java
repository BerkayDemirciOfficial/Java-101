import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        double number1, number2;
        int calculation;

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        number1 = inp.nextDouble();

        System.out.print("Enter Second Number : ");
        number2 = inp.nextDouble();

        System.out.print("Addition : 1 \nSubtraction : 2 \nDivision : 3 \nMultiplication : 4 \nChoose Operation : ");
        calculation = inp.nextInt();

        switch (calculation) {

            case 1:
                System.out.print(number1 + number2);
                break;

            case 2:
                System.out.print(number1 - number2);
                break;

            case 3:
                System.out.print(number1 / number2);
                break;

            case 4:
                System.out.print(number1 * number2);
                break;

            default:
                System.out.print("Redo The Operation! ");


        }

    }
}