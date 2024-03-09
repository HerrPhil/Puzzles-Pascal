public class DynamicPascal {

    public static void main(String [] args) {
        System.out.printf("Hello DynamicPascal\u0027s Triangle%n");
        if (args != null && args.length == 1 && args[0].toLowerCase().equals("-usage")) {
            System.out.printf("java DynamicPascal <input>%n");
            System.out.printf("where <input> is the number of rows%n");
            return;
        }
        if (args == null || args.length == 0) { // check for args
            System.out.printf("Number of rows of Pascal\u0027s Triangle is necessary%n");
            return;
        }
        String input = args[0];
        boolean hasDigitsOnly = input.matches("-?\\d+");
        if (!hasDigitsOnly) {
            System.out.printf("Number of rows must be only digits%n");
            return;
        }
        DynamicPascal myTriangle = new DynamicPascal(input);
        myTriangle.print();
    }

    private String numberOfRows;

    public DynamicPascal(String numberOfRows) {
        this.numberOfRows = numberOfRows;
    }

    public void print() {

        System.out.printf("Number of rows %s%n", numberOfRows);
        System.out.printf("triangle is%n");

        int n = Integer.valueOf(numberOfRows);
        // an auxiliary array to store generated pascal triangle numbers
        int [][] triangle = new int[n][n];

        // Iterate through every line and print integer(s) in it
        for (int line = 0; line < n; line++) {

            // Every line has a number of integers equal to the line number
            for (int i = 0; i <= line; i++) {

                // first and last values in every row are 1
                if (i == 0 || i == line) {
                    triangle[line][i] = 1;
                } else {
                    // Other values are the sum of values
                    // that above, to the left and to the right
                    triangle[line][i] = triangle[line-1][i-1] + triangle[line-1][i];
                }

                System.out.printf("%d", triangle[line][i]);
                if (i < line) {
                    System.out.printf(" ");
                }
            }

            // goto next line
            System.out.printf("%n");

        }
    }
}
