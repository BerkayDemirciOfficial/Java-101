public class PalidromNumber {


    static boolean isPalindrom(int number) {

        int tempNumber = number, reverseNumber = 0, reminder;

        while (tempNumber != 0) {

            reminder = tempNumber % 10;
            reverseNumber = (reverseNumber * 10) + reminder;
            tempNumber /= 10;
        }

        if (number == reverseNumber) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {

        System.out.print(isPalindrom(1234));


    }


}
