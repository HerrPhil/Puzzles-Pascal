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
        Pascal myTriangle = new Pascal(args[0]);
        myTriangle.print();
    }

    private String numberOfRows;

    public Pascal(String numberOfRows) {
        this.numberOfRows = numberOfRows;
    }

    public void print() {
        System.out.printf("Number of rows %s%n", numberOfRows);
    }
}
