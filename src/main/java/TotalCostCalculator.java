import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TotalCostCalculator {
    public static void main(String[] args) {
        String paragraph = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?";

        int laptopPrice = extractPrice(paragraph, "laptop");
        int mousePrice = extractPrice(paragraph, "mouse");

        int totalPrice = laptopPrice + mousePrice;
        double discountPercentage = 15.0;
        double discountAmount = (discountPercentage / 100.0) * totalPrice;
        double discountedPrice = totalPrice - discountAmount;

        System.out.println("Laptop price: " + laptopPrice + " tk");
        System.out.println("Mouse price: " + mousePrice + " tk");
        System.out.println("Total price: " + totalPrice + " tk");
        System.out.println("Discounted price (15% off): " + discountedPrice + " tk");
    }

    public static int extractPrice(String text, String item) {
        String pattern = "\\b" + item + " price is (\\d+) tk\\b";
        Pattern regex = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = regex.matcher(text);

        if (matcher.find()) {
            String priceStr = matcher.group(1);
            return Integer.parseInt(priceStr);
        }

        return 0;
    }
}
