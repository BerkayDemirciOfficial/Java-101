import java.util.Scanner;

public class ChineseZodiacCalendar {

    public static void main(String[] args) {

        int birthday, remainder;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter your birthday : ");
        birthday = inp.nextInt();

        remainder = birthday % 12;

        switch (remainder) {
            case 0:
                System.out.print("Monkey");
                break;

            case 1:
                System.out.print("Rooster");
                break;
            case 2:
                System.out.print("Dog");
                break;
            case 3:
                System.out.print("Pig");
                break;
            case 4:
                System.out.print("Mouse");
                break;
            case 5:
                System.out.print("Ox");
                break;
            case 6:
                System.out.print("Tiger");
                break;
            case 7:
                System.out.print("Rabbit");
                break;
            case 8:
                System.out.print("Dragon");
                break;
            case 9:
                System.out.print("Snake");
                break;
            case 10:
                System.out.print("Horse");
                break;
            case 11:
                System.out.print("Sheep");
                break;
        }


    }
}
