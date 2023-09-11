public class FindingPalindromeWords {

    static boolean isWord(String str) {

        int i = 0;
        int j = str.length() - 1;

        if (str.charAt(i) == str.charAt(j)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.print(isWord("edippide"));

    }


}

