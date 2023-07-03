import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {
        double height, weight, index;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the your Height(meter) : ");
        height = inp.nextDouble();

        System.out.print("Enter the your Weight (kg) : ");
        weight = inp.nextDouble();

        index = weight / (height * height);

        System.out.print("Your body mass index : "+ index);


    }
}
