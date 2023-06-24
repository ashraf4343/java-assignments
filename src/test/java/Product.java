public class Product {
    public int vat;
    public static void main(String[] args) {
        Product shirt=new Product(15);
        int totalPrice=shirt.getPrice(1,100);
        System.out.println(totalPrice);

        Product saree=new Product(20);
         totalPrice=saree.getPrice(2,100);
        System.out.println(totalPrice);


    }
    public Product(int vat){
        this.vat=vat;

    }
    public int getPrice(int quantity,int price){
        int totalPrice=(quantity*price)+(quantity*price*vat)/100;

                return totalPrice;

    }
}
