import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        int fibonacci = 0, number1 = 0, number2 = 1, circle = 15;


        for (int i = 0; i <= circle; i++) {

            fibonacci = number1 + number2;
            System.out.print("," + fibonacci);

            number1 = number2;
            number2 = fibonacci;
        }


    }


}


