public class MyEncapsulation {
    public static void main(String[] args) {
 Dress shirt = new Dress();
 shirt.setBrand("richman");
 shirt.setColor("red");

 String color = shirt.getColor();

 String brand= shirt.getBrand();

        System.out.println("shirt is a brand"+brand);
        System.out.println("shirt is a colour"+color);


    }


    }
class Dress{
    private String color;
    private String brand;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int calculatePrice(int quantity, int price){
        return quantity*price;
    }
}
