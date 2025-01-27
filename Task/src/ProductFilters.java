import java.util.ArrayList;
import java.util.List;

public class ProductFilters {

    public List<Product> filteredItems = new ArrayList<>();


    public void filterByCategory(List<Product> filteredItems, String category) {
        System.out.println("All of our " + category + " products are: ");
        for(Product product: filteredItems){
            if(category == product.category){
                System.out.println(product.productName + " - " + product.category);
            }
        }
    }

    public void filterByPrice(List<Product> filteredItems, double min, double max){
        System.out.println("All items between " + min + "$ and " + max + "$ are: ");
        for(Product product: filteredItems){
            if(min <= product.price &&  product.price <= max){
                System.out.println(product.productName + " - " + product.price);
            }
        }
    }
}
