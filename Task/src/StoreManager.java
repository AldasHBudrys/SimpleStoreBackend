import java.util.ArrayList;
import java.util.LinkedList;

public class StoreManager {

    public ArrayList<Product> products = new ArrayList<>();
    public LinkedList<Customer> customers = new LinkedList<>();

    public void generateReport(){
        System.out.println("All of our currents products are: ");
        for(Product product: products){
            System.out.println(product);
        }
        System.out.println();
        System.out.println("All of our customers and their order history: ");
        for(Customer customer: customers){
            System.out.println(customer +": " + customer.orderHistory);
        }
    }

    public void removeOutOfStock(Product product){
        products.remove(product);
    }
}
