package Level1;

import java.util.*;
import java.util.stream.*;

class Sale {
    String productId;
    int quantity;
    double price;

    public Sale(String productId, int quantity, double price) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductId() { return productId; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }
}

class ProductSales {
    String productId;
    double totalRevenue;

    public ProductSales(String productId, double totalRevenue) {
        this.productId = productId;
        this.totalRevenue = totalRevenue;
    }

    public String getProductId() { return productId; }
    public double getTotalRevenue() { return totalRevenue; }

    public String toString() {
        return productId + " - $" + totalRevenue;
    }
}

public class SalesProcessor {
    public static void main(String[] args) {
        List<Sale> sales = Arrays.asList(
            new Sale("P1", 15, 100),
            new Sale("P2", 8, 200),
            new Sale("P3", 12, 150),
            new Sale("P4", 20, 50),
            new Sale("P5", 5, 300),
            new Sale("P6", 18, 120),
            new Sale("P7", 11, 80),
            new Sale("P8", 25, 40),
            new Sale("P9", 30, 60),
            new Sale("P10", 10, 90)
        );

        List<ProductSales> top5 = sales.stream()
            .filter(s -> s.getQuantity() > 10)
            .map(s -> new ProductSales(s.getProductId(), s.getQuantity() * s.getPrice()))
            .sorted(Comparator.comparingDouble(ProductSales::getTotalRevenue).reversed())
            .limit(5)
            .collect(Collectors.toList());

        top5.forEach(System.out::println);
    }
}
