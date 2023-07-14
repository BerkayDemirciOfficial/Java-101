import java.util.Scanner;

public class AtmProgram {

    public static void main(String[] args) {

        String userName, password;

        int right = 3, balance = 2000, select;

        Scanner inp = new Scanner(System.in);

        do {

            System.out.print("Username : ");
            userName = inp.nextLine();

            System.out.print("Password : ");
            password = inp.nextLine();

            right--;


            if (userName.equals("Melis") && password.equals("m123")) {

                System.out.println("\nWelcome to your Bank.\n");

                do {
                    System.out.println("1.Deposit \n2.Withdrawal \n3.Balance Inquiry\n4.Log Out");
                    System.out.print("Select a Transaction : ");
                    select = inp.nextInt();

                    switch (select) {

                        case 1:

                            int money;
                            System.out.print("Enter the Amount of Money : ");
                            money = inp.nextInt();

                            balance = balance + money;
                            System.out.println("New Balance : " + balance);

                            break;

                        case 2:

                            System.out.print("Enter the Amount of Money : ");
                            money = inp.nextInt();

                            if (money > balance) {

                                System.out.println("Insufficient Balance.");

                                System.out.print("Enter the Amount of Money : ");
                                money = inp.nextInt();

                                balance = balance - money;
                                System.out.println("New Balance : " + balance);

                            } else {
                                balance = balance - money;
                                System.out.println("New Balance : " + balance);
                            }
                            break;

                        case 3:

                            System.out.println("Balance : " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("See you latter.");
                break;

            } else if (right == 1 || right == 2) {

                System.out.println("Your username or password is incorrect. Please try again.");

            } else {

                System.out.print("Your account has been blocked. Contact your bank.");
            }

        } while (right > 0);
    }
}
