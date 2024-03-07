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

    public Pascal(String numberOfRows) {
        this.numberOfRows = numberOfRows;
    }

    public void print() {
        System.out.printf("Number of rows %s%n", numberOfRows);
        initialize();
        fillByRows();
        // fillByPreviousSums();
    }

    private void initialize() {
        System.out.printf("initialize%n");
        int triangleRowCount = Integer.valueOf(numberOfRows);
        int triangleSize = 0;
        for (int iRow = triangleRowCount; iRow > 0; iRow--) {
            triangleSize += iRow;
        }
        System.out.printf("size of triangle is %d elements%n", triangleSize);
        triangle = new ArrayList<String>(triangleSize);
    }

    private void fillByRows() {
        System.out.printf("fill by rows%n");
    }
}
