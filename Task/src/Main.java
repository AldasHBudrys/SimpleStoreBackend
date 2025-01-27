import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        StoreManager storeManager = new StoreManager();
        ProductFilters filter = new ProductFilters();

        Electronics laptop = new Electronics("Laptop", 1000.99, "Electronics", 10, "2 years");
        Electronics usb = new Electronics("USB 16-GB", 39.99, "Electronics", 3, "1 year");
        Clothing shirt = new Clothing("Shirt", 15.99, "Clothing", 20, "L");
        Clothing skirt = new Clothing("Skirt", 34.99, "Clothing", 10, "M");

        Customer customer1 = new Customer("Tom", "Tom.email");

        Order order1 = new Order(1001);

        Collections.addAll(storeManager.products, laptop, usb, shirt, skirt);
        Collections.addAll(filter.filteredItems, laptop, usb,shirt, skirt);

        storeManager.removeOutOfStock(shirt);

        storeManager.customers.add(customer1);

        order1.addProduct(laptop,2);
        order1.addProduct(shirt,3);

        customer1.placeOrder(order1);

        storeManager.generateReport();
        System.out.println();

        System.out.println(order1);
        System.out.println(order1.calculateTotal() + "$$");
        System.out.println();

        System.out.println(customer1.orderHistory);
        System.out.println();

        filter.filterByCategory(filter.filteredItems, "Electronics");
        System.out.println();

        filter.filterByPrice(filter.filteredItems, 1.00, 50.00);

    }
}

