public class OptimizedPascal {

    public static void main(String [] args) {
        System.out.printf("Hello OptimizdPascal\u0027s Triangle%n");
        if (args != null && args.length == 1 && args[0].toLowerCase().equals("-usage")) {
            System.out.printf("java OptimizdPascal <input>%n");
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
        OptimizedPascal myTriangle = new OptimizedPascal(input);
        myTriangle.print();
    }

    private String numberOfRows;

    public OptimizedPascal(String numberOfRows) {
        this.numberOfRows = numberOfRows;
    }

    public void print() {
        System.out.printf("Number of rows %s%n", numberOfRows);
        System.out.printf("triangle is%n");
        for (int line = 1; line <= Integer.valueOf(numberOfRows); line++) {
            int C = 1; // used to represent C(line, i)
            for (int i = 1; i <= line; i++) {
                // The first value in a line is always 1, C(line, 0)
                System.out.printf("%d", C);
                if ( i < line) {
                    System.out.printf(" ");
                }
                // System.out.printf("%n%nC(line, i) = %d * (%d - %d) / %d%n%n", C, line, i, i);
                C = C * (line - i) / i;
            }
            System.out.printf("%n");
        }
    }

}
