import java.util.Scanner;

public class PassTheClass {

    public static void main(String[] args) {

        int chemistry, physic, turkish, history, music;
        Scanner input = new Scanner(System.in);


        System.out.print("Enter Chemistry exam grade : ");
        chemistry = input.nextInt();

        if (0 <= chemistry && chemistry <= 100) {

        } else {
            System.out.print("Please Enter Chemistry exam grade correctly : ");
            chemistry = input.nextInt();
        }


        System.out.print("Enter Physic exam grade : ");
        physic = input.nextInt();

        if (0 <= physic && physic <= 100) {

        } else {
            System.out.print("Please Enter Physic exam grade correctly : ");
            physic = input.nextInt();
        }


        System.out.print("Enter Turkish exam grade : ");
        turkish = input.nextInt();

        if (0 <= turkish && turkish <= 100) {

        } else {
            System.out.print("Please Enter Turkish exam grade correctly : ");
            turkish = input.nextInt();
        }


        System.out.print("Enter History exam grade : ");
        history = input.nextInt();

        if (0 <= history && history <= 100) {

        } else {
            System.out.print("Please Enter History exam grade correctly : ");
            history = input.nextInt();
        }


        System.out.print("Enter Music exam grade : ");
        music = input.nextInt();

        if (0 <= music && music <= 100) {

        } else {
            System.out.print("Please Enter Music exam grade correctly : ");
            music = input.nextInt();
        }


        double average = (chemistry + physic + history + music + turkish) / 5;


        String result = average >= 55 ? "The course completed" : "The course could not be completed";

        System.out.println("Average : " + average);
        System.out.print("Result : " + result);
    }
}








