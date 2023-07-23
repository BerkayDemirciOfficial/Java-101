import java.util.Scanner;

public class BaseCalculationWithRecursive {


    static int baseCalculation(int base, int power) {
        if (power == 0) {
            return 1;
        }
        return base * baseCalculation(base, power - 1);

    }

    public static void main(String[] args) {

        int base, power,result;


        Scanner inp = new Scanner(System.in);

        System.out.print("Base : ");
        base = inp.nextInt();

        System.out.print("Power : ");
        power = inp.nextInt();

        result= baseCalculation(base, power);

        System.out.print("Result : " + result);
    }
}
