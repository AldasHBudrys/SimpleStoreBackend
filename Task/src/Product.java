public abstract class Product implements Discountable {
    String productName;
    double price;
    String category;
    int stock;

    Product(String productName, double price, String category, int stock){
        this.productName = productName;
        this.price = price;
        this.category = category;
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void applyDiscount(double flatDiscount){
        this.price = this.price - flatDiscount;
    }

    public void applyBulkDiscount(int itemCount, double flatDiscount){
        this.price = this.price - (itemCount*flatDiscount);
    }

    @Override
    public String toString(){
        return "Name: " + productName +" - " + " Price: " + price +" - " + " Category: " + category +" - " + " stock: " + stock;
    }
}
