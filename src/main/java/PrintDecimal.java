public class PrintDecimal {
    public static void main(String[] args) {
        double a = 15.5276;
        double roundedValue = Math.round(a * 100.0) / 100.0;

        System.out.printf("a = %.2f\n", roundedValue);
    }
}

