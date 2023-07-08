import java.util.Scanner;

public class HoroscopeProgram {

    public static void main(String[] args) {

        int day, month;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the birth month : ");
        month = inp.nextInt();

        System.out.print("Enter the birth day : ");
        day = inp.nextInt();

        if (month == 1) {

            if (1 <= day && day <= 21) {

                System.out.print("Your horoscope is Capricorn! ");

            } else if (21 < day && day <= 31) {

                System.out.print("Your horoscope is Aquarius! ");

            } else {

                System.out.print("Re-enter your information!");
            }


        } else if (month == 2) {

            if (1 <= day && day <= 19) {

                System.out.print("Your horoscope is Aquarius! ");

            } else if (19 < day && day <= 29) {

                System.out.print("Your horoscope is Pisces! ");

            } else {

                System.out.print("Re-enter your information!");
            }
        } else if (month == 3) {

            if (1 <= day && day <= 20) {

                System.out.print("Your horoscope is Pisces! ");

            } else if (20 < day && day <= 31) {

                System.out.print("Your horoscope is Aries! ");

            } else {

                System.out.print("Re-enter your information!");
            }

        } else if (month == 4) {

            if (1 <= day && day <= 20) {

                System.out.print("Your horoscope is Aries! ");

            } else if (20 < day && day <= 30) {

                System.out.print("Your horoscope is Taurus! ");

            } else {

                System.out.print("Re-enter your information!");
            }

        } else if (month == 5) {

            if (1 <= day && day <= 21) {

                System.out.print("Your horoscope is Taurus! ");

            } else if (21 < day && day <= 31) {

                System.out.print("Your horoscope is Gemini! ");

            } else {

                System.out.print("Re-enter your information!");
            }

        } else if (month == 6) {

            if (1 <= day && day <= 22) {

                System.out.print("Your horoscope is Gemini! ");

            } else if (23 < day && day <= 30) {

                System.out.print("Your horoscope is Cancer! ");

            } else {

                System.out.print("Re-enter your information!");
            }

        } else if (month == 7) {

            if (1 <= day && day <= 22) {

                System.out.print("Your horoscope is Cancer! ");

            } else if (22 < day && day <= 31) {

                System.out.print("Your horoscope is LEO! ");

            } else {

                System.out.print("Re-enter your information!");
            }

        } else if (month == 8) {

            if (1 <= day && day <= 22) {

                System.out.print("Your horoscope is LEO! ");

            } else if (23 < day && day <= 31) {

                System.out.print("Your horoscope is Virgo! ");

            } else {

                System.out.print("Re-enter your information!");
            }

        } else if (month == 9) {

            if (1 <= day && day <= 22) {

                System.out.print("Your horoscope is Virgo! ");

            } else if (23 < day && day <= 30) {

                System.out.print("Your horoscope is Scales! ");

            } else {

                System.out.print("Re-enter your information!");
            }

        } else if (month == 10) {

            if (1 <= day && day <= 22) {

                System.out.print("Your horoscope is Scales! ");

            } else if (23 < day && day <= 31) {

                System.out.print("Your horoscope is Scorpio! ");

            } else {

                System.out.print("Re-enter your information!");
            }

        } else if (month == 11) {

            if (1 <= day && day <= 21) {

                System.out.print("Your horoscope is Scorpio! ");

            } else if (22 < day && day <= 30) {

                System.out.print("Your horoscope is Sagittarius! ");

            } else {

                System.out.print("Re-enter your information!");
            }

        } else if (month == 12) {

            if (1 <= day && day <= 21) {

                System.out.print("Your horoscope is Sagittarius! ");

            } else if (22 < day && day <= 30) {

                System.out.print("Your horoscope is Capricorn! ");

            } else {

                System.out.print("Re-enter your information!");
            }
        }


    }


}

