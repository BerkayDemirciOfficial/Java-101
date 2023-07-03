import java.util.Scanner;

public class CourseAverageCalculation {
    public static void main(String[] args) {
        int chemistry, physic, turkish, history, music;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Chemistry exam grade : ");
        chemistry = input.nextInt();

        System.out.print("Enter Physic exam grade : ");
        physic = input.nextInt();

        System.out.print("Enter Turkish exam grade : ");
        turkish = input.nextInt();

        System.out.print("Enter History exam grade : ");
        history = input.nextInt();

        System.out.print("Enter Music exam grade : ");
        music = input.nextInt();


        double average = (chemistry + physic + history + music + turkish) / 5;


        String result = average >= 60 ? "The course completed" : "The course could not be completed";

        System.out.println(average);
        System.out.print(result);
    }
}
