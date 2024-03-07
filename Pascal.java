import java.util.ArrayList;

public class Pascal {

    public static void main(String [] args) {
        System.out.printf("Hello Pascal\u0027s Triangle%n");
        if (args != null && args.length == 1 && args[0].toLowerCase().equals("-usage")) {
            System.out.printf("java Pascal <input>%n");
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
        Pascal myTriangle = new Pascal(input);
        myTriangle.print();
    }

    private String numberOfRows;

    private ArrayList<String> triangle;
    private int triangleSize;

    public Pascal(String numberOfRows) {
        this.numberOfRows = numberOfRows;
        this.triangleSize = 0;
    }

    public void print() {
        System.out.printf("Number of rows %s%n", numberOfRows);
        initialize();
        fillByRows();
        // fillByPreviousSums();
        System.out.printf("triangle is%n");
        for (int i = 0; i < triangleSize; i++) {
            // interim printing
            System.out.printf("%s%n", triangle.get(i));
        }
    }

    private void initialize() {
        System.out.printf("initialize%n");
        int triangleRowCount = Integer.valueOf(numberOfRows);
        for (int iRow = triangleRowCount; iRow > 0; iRow--) {
            triangleSize += iRow;
        }
        System.out.printf("size of triangle is %d elements%n", triangleSize);
        triangle = new ArrayList<String>(triangleSize);
    }

    private void fillByRows() {
        System.out.printf("fill by rows%n");
        // add binomial coefficients to each element
        int triangleRowCount = Integer.valueOf(numberOfRows);
        int triangleIndex = 0;
        for (int row = 0; row < triangleRowCount; row++) {
            for (int column = 0; column < row + 1; column++) {
                int binomialCoefficient = getBinomialCoefficient(row, column);
                System.out.printf("put %d in index %d%n", binomialCoefficient, triangleIndex);
                triangle.add(triangleIndex, String.valueOf(binomialCoefficient)); // temporary
                triangleIndex++;
            }
        }
    }

    private int getBinomialCoefficient(int n, int k) {
        // The Binomial Coefficient is an unorder combination of n values where k are chosen
        // The factorial of n and k are used to calculate the value
        // n!/(k!(n-k)!)
        return factorial(n) / ( factorial(k) * factorial(n-k) );
    }

    private int factorial(int value) {
        // Edge case: Zero factorial value is 1
        if (value == 0) return 1;
        // non-zero factorial is 1*2*3*...*n
        int result = value;
        int next = value - 1;
        while (next > 0) {
            result *= next;
            next--;
        }
        return result;
    }

}
