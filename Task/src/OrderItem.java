public class OrderItem {

    Product product;
    int quantity;

    OrderItem(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity(){
        return quantity;
    }

    double getSubtotal(){
        return product.price * quantity;
    }

    @Override
    public String toString(){
        return product.productName + " :" + quantity;
    }
}
