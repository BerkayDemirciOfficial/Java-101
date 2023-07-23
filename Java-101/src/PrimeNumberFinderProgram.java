import java.util.Scanner;

public class PrimeNumberFinderProgram {

    static int PrimeNumberFinderProgram(int number, int i) {

        if (i == 1) {
            return 1;
        } else if (number % i == 0) {
            return 0;
        }

        return PrimeNumberFinderProgram(number, i - 1);
    }

    public static void main(String[] args) {

        int number, prime;

        Scanner inp = new Scanner(System.in);

        System.out.print("Number : ");
        number = inp.nextInt();

        prime = PrimeNumberFinderProgram(number, number / 2);

        if (prime == 1) {

            System.out.println("Number is prime.");
        } else {

            System.out.println("Number is not prime.");
        }
    }
}
