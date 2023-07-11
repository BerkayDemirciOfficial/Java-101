import java.util.Scanner;

public class FactorialCalculation {

    public static void main(String[] args) {

        int user, product = 1;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter A Number : ");
        user = inp.nextInt();


        for (int i = 1; i <= user; i++) {

            product = product * i;
        }

        System.out.println(user + " Factorial : " + product);


    }
}
