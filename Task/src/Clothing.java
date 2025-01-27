public class Clothing extends Product{
    String size;

    Clothing(String productName, double price, String category, int stock, String size) {
        super(productName, price, category, stock);
        this.size = size;
    }

    void getSize(){
        System.out.println("The size of " + productName + " is " + size);
    }
}
