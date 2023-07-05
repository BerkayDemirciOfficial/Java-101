import java.util.Scanner;

public class TaxiMeter {

    public static void main(String[] args) {

        double distaneKm, price;

        Scanner inp= new Scanner(System.in);
        System.out.print("Enter distance(km) : ");
        distaneKm= inp.nextDouble();

        price= 10 + (distaneKm*2.20);

        if(price<=20){

            System.out.print("Price is 20 Tl.");

        }else{
            System.out.print("Price is "+ price+" Tl.");

        }


    }
}
