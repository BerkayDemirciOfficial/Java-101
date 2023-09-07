public class writtingLetterBWithStars {

    public static void main(String[] args) {

        String array[][] = new String[6][4];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                if (i == 0 || i == 2 || i == 5) {
                    array[i][j] = " * ";


                } else if (j == 0 || j == 3) {
                    array[i][j] = " * ";

                } else {
                    array[i][j] = "   ";
                }
            }
        }
        for (String[] row : array) {
            for (String column : row) {
                System.out.print(column);
            }
            System.out.println();
        }


    }

}
