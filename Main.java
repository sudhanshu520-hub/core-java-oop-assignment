class ProductBilling {

    // Method for billing 1 product
    void bill(double price1) {
        double total = price1;
        System.out.println("Total for 1 product: " + total);
    }

    // Method for billing 2 products
    void bill(double price1, double price2) {
        double total = price1 + price2;
        System.out.println("Total for 2 products: " + total);
    }

    // Method for billing 3 products
    void bill(double price1, double price2, double price3) {
        double total = price1 + price2 + price3;
        System.out.println("Total for 3 products: " + total);
    }
}

public class Main {
    public static void main(String[] args) {

        ProductBilling pb = new ProductBilling();

        // Calling overloaded methods
        pb.bill(100);                 // 1 product
        pb.bill(100, 200);           // 2 products
        pb.bill(100, 200, 300);      // 3 products
    }
}
    

