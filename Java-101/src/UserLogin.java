import java.util.Scanner;

public class UserLogin {

    public static void main(String[] args) {

        int userpassword = 123444, password;

        Scanner inp = new Scanner(System.in);
        System.out.print("Please Enter Your Password : ");
        password = inp.nextInt();

        if (userpassword == password) {

            System.out.print("Your password is correct.");

        } else if (userpassword != password) {

            int answer;
            System.out.print("Would you like to reset your password?\nYes : 1\nNo : 2\nYour Preference :  ");
            answer = inp.nextInt();

            if (answer == 1) {


                int newpassword;

                System.out.print(" Enter Your New Password : ");
                newpassword = inp.nextInt();

                if (newpassword == password || newpassword == userpassword) {

                    int newpassword2;

                    System.out.print("Your new password should not be your old password and last password you entered !\nPlease Enter New Password : ");
                    newpassword2 = inp.nextInt();


                    if (newpassword2 == password || newpassword2 == userpassword) {

                        System.out.print("İncorrect password. Please try again later.");

                    } else {

                        System.out.print("Your password has been created.");
                    }


                } else {

                    System.out.print("Your password has been created.");
                }


            } else {

                System.out.print("\nWe wish you a nice day.");
            }


        }


    }
}
