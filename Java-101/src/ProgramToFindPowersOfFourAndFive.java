import java.util.Scanner;

public class ProgramToFindPowersOfFourAndFive {

    public static void main(String[] args) {


        int user;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter A Number : ");
        user = inp.nextInt();


        for (int i = 1; i < user; i *= 4) {

            System.out.println(i);
        }

        System.out.println("-------");

        for (int i = 1; i < user; i *= 5) {

            System.out.println(i);
        }
    }
}
