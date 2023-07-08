import java.util.Scanner;

public class ActivityRecommendationBasedOnAirTemperature {

    public static void main(String[] args) {

        double temperature;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the Temperature : ");
        temperature = inp.nextDouble();


        if (temperature <= 5) {

            System.out.print("Today is a beautiful day for Ski!");

        } else if (5 < temperature && temperature <= 15) {

            System.out.print("Today is a beautiful day for Cinema!");

        } else if (15 < temperature && temperature <= 25) {

            System.out.print("Today is a beautiful day for Picnic!");

        } else {

            System.out.print("Today is a beautiful day for Swimming!");

        }


    }
}
