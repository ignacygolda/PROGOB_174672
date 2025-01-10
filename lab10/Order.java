public class Order implements Comparable<Order> {
    String productName;
    int quantity;
    double unitPrice;

    public Order(String productName, int quantity, double unitPrice) {
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    @Override
    public int compareTo(Order o) {
        if(this.unitPrice < o.unitPrice) return 1;
        else if(this.unitPrice > o.unitPrice) return -1;
        else {
            if(this.quantity < o.quantity) return 1;
            else if(this.quantity > o.quantity) return -1;
            else return 0;
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
