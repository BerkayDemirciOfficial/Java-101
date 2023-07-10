import java.util.Scanner;

public class LeapYearCalculation {

    public static void main(String[] args) {

        int year;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a Year : ");
        year= inp.nextInt();


        if (year % 100 == 0 && year % 400 == 0) {

            System.out.print("This year is leap year.");

        } else if (year % 100 != 0 && year % 4 == 0) {

            System.out.print("This year is leap year.");
        } else {

            System.out.print("This year is not leap year.");
        }


    }
}
