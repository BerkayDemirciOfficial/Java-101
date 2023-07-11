import java.util.Scanner;

public class AverageOfNumbersDivisibleBy3And4 {

    public static void main(String[] args) {

        int user, k = 0, total = 0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number : ");
        user = inp.nextInt();

        for (int i = 1; i <= user; i++) {

            if (i % 12 == 0) {

                total = total + i;
                k++;

            }
        }

        double average = total / k;

        System.out.print(average);


    }
}
