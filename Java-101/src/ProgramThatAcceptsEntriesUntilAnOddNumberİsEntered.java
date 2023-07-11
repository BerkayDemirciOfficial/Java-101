import java.util.Scanner;

public class ProgramThatAcceptsEntriesUntilAnOddNumberİsEntered {

    public static void main(String[] args) {

        int user, total = 0;

        Scanner inp = new Scanner(System.in);

        do {

            System.out.print("Enter a number : ");
            user = inp.nextInt();

            if (user % 2 == 0) {
                total = total + user;
            }

        } while (user % 2 == 0);

        System.out.println("Sum Of Even Numbers : " + total);


    }

}
