public class Product {
    static double discount = 10.0;
    private final String productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public double getTotalPriceAfterDiscount() {
        double total = price * quantity;
        return total - (total * discount / 100);
    }

    public void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID : " + productID);
            System.out.println("Product Name : " + productName);
            System.out.println("Unit Price : ₹" + price);
            System.out.println("Quantity : " + quantity);
            System.out.println("Discount : " + discount + "%");
            System.out.println("Total Price : ₹" + getTotalPriceAfterDiscount());
        } else {
            System.out.println("Invalid product object.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("PRD001", "Wireless Mouse", 799, 2);
        Product p2 = new Product("PRD002", "Keyboard", 1499, 1);

        System.out.println("== Product 1 ==");
        p1.displayDetails();
        System.out.println();

        System.out.println("== Product 2 ==");
        p2.displayDetails();
        System.out.println();

        Product.updateDiscount(15.0);

        System.out.println("== After Updating Discount ==");
        p1.displayDetails();
    }
}
