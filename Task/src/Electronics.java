public class Electronics extends Product{
    String warrantyPeriod;


    Electronics(String productName, double price, String category, int stock, String warrantyPeriod) {
        super(productName, price, category, stock);
        this.warrantyPeriod = warrantyPeriod;
    }

    void getWarrantyPeriod(){
        System.out.println("The warranty for " + this.productName+ " is " + this.warrantyPeriod);
    }
}
