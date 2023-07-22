import java.util.Scanner;

public class AdvancedCalculator {

    static void addition() {

        int number, result = 0, i = 1;

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.print(i++ + ". Number :");
            number = scan.nextInt();

            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Result : " + result);

    }


    static void substraction() {

        int number, result = 0, counter;

        Scanner inp = new Scanner(System.in);

        System.out.print("How many numbers are you going to entering ? : ");
        counter = inp.nextInt();

        for (int i = 1; i <= counter; i++) {

            System.out.print(i + ". Number : ");
            number = inp.nextInt();

            if (i == 1) {
                result += number;
                continue;
            }

            if (i == 0) {
                break;
            }
            result -= number;
        }
        System.out.println("Result : " + result);
    }

    static void multiplication() {

        int number, result = 1, i = 1;

        Scanner inp = new Scanner(System.in);

        while (true) {
            System.out.print(i++ + ". Number : ");
            number = inp.nextInt();

            if (number == 1) {
                break;
            }

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Result : " + result);
    }

    static void division() {

        double result = 0.0;
        int number, counter;

        Scanner inp = new Scanner(System.in);

        System.out.print("How many numbers are you going to entering ? : ");
        counter = inp.nextInt();

        for (int i = 1; i <= counter; i++) {

            System.out.print(i + ". Number : ");
            number = inp.nextInt();

            if (i != 1 && number == 0) {
                System.out.println("Divisor cannot be Zero");
                continue;
            }

            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Result : " + result);
    }

    static void exponential() {

        int result = 0, total = 1, base, power;
        ;

        Scanner inp = new Scanner(System.in);

        System.out.print("Base : ");
        base = inp.nextInt();

        System.out.print("Power : ");
        power = inp.nextInt();

        for (int i = 1; i <= power; i++) {
            total *= base;
        }
        result += total;

        System.out.println("Result : " + result);

    }

    static void factorial() {

        int number, total = 1, result = 0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Number : ");
        number = inp.nextInt();

        for (int i = 1; i <= number; i++) {
            total *= i;
        }
        result += total;

        System.out.println("Result : " + result);

    }

    static void mod() {
        int number, reminder, dividing;

        Scanner inp = new Scanner(System.in);

        System.out.print("1. Number : ");
        number = inp.nextInt();

        System.out.print("2. Number : ");
        dividing = inp.nextInt();


        reminder = number % dividing;

        System.out.println("Result :  " + reminder);
    }

    static void rectangle() {

        int edge1, edge2, area, perimeter;

        Scanner inp = new Scanner(System.in);

        System.out.print("1. Edge : ");
        edge1 = inp.nextInt();


        System.out.print("2. Edge : ");
        edge2 = inp.nextInt();

        area = edge1 * edge2;

        perimeter = 2 * (edge1 + edge2);

        System.out.println("Area : " + area);
        System.out.println("Perimeter : " + perimeter);

    }


    public static void main(String[] args) {

        int select;

        Scanner inp = new Scanner(System.in);

        System.out.println("1. Addition\n" +
                "2.Subsraction\n" +
                "3.Multiplication\n" +
                "4.Division\n" +
                "5.Exponential\n" +
                "6.Factorial\n" +
                "7.Mod\n" +
                "8.Rectangular Area and Perimeter Calculation\n" +
                "0.Exit");


        do {
            System.out.print("Select a Number : ");
            select = inp.nextInt();


            switch (select) {

                case 1:
                    addition();
                    break;

                case 2:
                    substraction();
                    break;

                case 3:
                    multiplication();
                    break;

                case 4:
                    division();
                    break;

                case 5:
                    exponential();
                    break;

                case 6:
                    factorial();
                    break;

                case 7:
                    mod();
                    break;

                case 8:
                    rectangle();
                    break;
            }
        } while (select != 0);


    }
}
