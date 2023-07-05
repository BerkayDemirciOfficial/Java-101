import java.util.Scanner;

public class CalculatingTheAreaAndParameterOfACircle {

    public static void main(String[] args) {

        double radius, area, perimeter, angle;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a radius : ");
        radius = inp.nextDouble();

        System.out.print("Enter a angle : ");
        angle = inp.nextDouble();

        if (angle == 0) {

            perimeter = 2 * 3.14 * radius;
            area = 3.14 * radius * radius;

            System.out.println("Area of Circle : " + area);
            System.out.print("Perimeter of Circle : " + perimeter);

        } else {

            perimeter = 2 * 3.14 * radius * (angle / 360);
            area = 3.14 * radius * radius * (angle / 360);

            System.out.println("Area of Circle : " + area);
            System.out.print("Perimeter of Circle : " + perimeter);


        }

    }
}
