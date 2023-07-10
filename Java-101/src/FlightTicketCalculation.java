import java.util.Scanner;

public class FlightTicketCalculation {

    public static void main(String[] args) {

        double distance, passengerAge, journeyType, price, discountedPrice;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter The Distance(km) : ");
        distance = inp.nextDouble();

        System.out.print("Enter Passenger Age : ");
        passengerAge = inp.nextDouble();

        System.out.print("One-way ticket : 1\nRound trip ticket : 2\nChoose The Journey Type : ");
        journeyType = inp.nextDouble();


        if (distance < 0 || passengerAge < 0 || journeyType != 1 && journeyType != 2) {

            System.out.print("\nIncorrect entry ! Please try again .\n");


        } else {

            price = distance * 0.1;


            if (passengerAge < 12) {
                discountedPrice = price * 0.5;

            } else if (12 < passengerAge && passengerAge < 24) {

                discountedPrice = price - (price * 0.1);

            } else if (65 < passengerAge) {

                discountedPrice = price - (price * 0.3);

            } else {

                discountedPrice = price;
            }


            if (journeyType == 2) {

                discountedPrice = (discountedPrice - (discountedPrice * 0.2)) * 2;

            }


            System.out.print("Total Amount : " + discountedPrice);


        }

    }
}
