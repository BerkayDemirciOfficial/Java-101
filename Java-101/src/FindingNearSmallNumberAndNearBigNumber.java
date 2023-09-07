import java.util.Scanner;

public class FindingNearSmallNumberAndNearBigNumber {

    public static void main(String[] args) {

        int[] list = {-3, 7, 18, 23, 42, -15};

        int nearMin = Integer.MIN_VALUE;
        int nearMax = Integer.MAX_VALUE;
        int user;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        user = input.nextInt();

        for (int i : list) {

            if (i < user) {

                if (i > nearMin) {

                    nearMin = i;
                }
            }
            if (i > user) {

                if (i < nearMax) {

                    nearMax = i;
                }
            }
        }
        System.out.println("Near Mİn Number : " + nearMin);
        System.out.println("Near Max Number : " + nearMax);

    }
}




