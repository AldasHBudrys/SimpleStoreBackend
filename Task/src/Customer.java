import java.util.LinkedList;

public class Customer {
    String name;
    String email;
    LinkedList<Order> orderHistory;

    Customer(String name, String email){
        this.name = name;
        this.email = email;
        this.orderHistory = new LinkedList<>();
    }

    public void placeOrder(Order order){
        orderHistory.add(order);
    }

    public String toString(){
        return name;
    }
}
