import java.util.LinkedList;

public class Order{

    int orderId;
    LinkedList<OrderItem> orderItems;

    Order(int orderId){
        this.orderId = orderId;
        this.orderItems =  new LinkedList<OrderItem>();
    }

    public void addProduct(Product product, int quantity){
        orderItems.add(new OrderItem(product, quantity));
    }

    public double calculateTotal() {
        double sum = 0;
        for(int i = 0; i < orderItems.size(); i++){
            var a = orderItems.get(i);
            sum += a.getSubtotal();
        }
        return sum;
    }

    @Override
    public String toString(){
        return "Order ID: " + orderId + "\n" + "Order items: " + orderItems;
    }
}
