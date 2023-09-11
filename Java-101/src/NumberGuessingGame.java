import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Random randomNumber = new Random();
        int number = randomNumber.nextInt(100);

        System.out.println("Random Number : " + number);

        Scanner input = new Scanner(System.in);

        int playerRight = 0;

        System.out.print("Please Enter a Number : ");


        while (playerRight < 3) {

            int userNumber = input.nextInt();

            if (userNumber < 0 || userNumber > 100) {

                if (playerRight == 0 || playerRight == 1) {

                    playerRight++;
                    System.out.println("You entered a wrong number!\nYou should choose a number between 0 and 100!");
                    System.out.println("Your Remaining right : " + (3 - playerRight));
                    System.out.print("Please Enter a new Number : ");

                } else {
                    System.out.print("You have completed your rights!");
                }

            }
            if (userNumber > 0 && userNumber <=100) {
                if (number != userNumber) {

                    if (playerRight == 0 || playerRight == 1) {

                        playerRight++;
                        System.out.println("Wrong Guess!");
                        System.out.println("Your Remaining right : " + (3 - playerRight));
                        System.out.print("Please Enter a new Number : ");

                    } else {

                        System.out.print("You have completed your rights!");
                    }

                } else {

                    System.out.print("Your guess is true!\nCongragilations !");
                    break;
                }
            }
        }
    }
}

