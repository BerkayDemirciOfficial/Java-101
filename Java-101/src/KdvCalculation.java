import java.util.Scanner;

public class KdvCalculation {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Capital : ");
        double capital = inp.nextDouble();
        double tax1 = 0.18D;
        double tax2 = 0.08D;
        double price;
        if (0.0D <= capital && capital <= 1000.0D) {
            price = capital + capital * tax1;
            System.out.print("Price is " + price + "TL");
        } else {
            if (!(1000.0D < capital)) {
                System.out.print("Invalid entry. Please re-enter Price.");

            }

            price = capital + capital * tax2;
            System.out.print("Price is " + price + "TL");
        }

    }
}
