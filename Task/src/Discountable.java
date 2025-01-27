public interface Discountable {

    void applyDiscount(double flatDiscount);
    void applyBulkDiscount(int itemCount, double flatDiscount);
}
