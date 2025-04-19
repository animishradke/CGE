package Level1;

public import java.util.ArrayList;
import java.util.List;

interface Category {
    String getCategoryName();
}

class BookCategory implements Category {
    public String getCategoryName() {
        return "Books";
    }
}

class ClothingCategory implements Category {
    public String getCategoryName() {
        return "Clothing";
    }
}

class GadgetCategory implements Category {
    public String getCategoryName() {
        return "Gadgets";
    }
}

class Product<T extends Category> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public T getCategory() {
        return category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDetails() {
        return name + " - " + category.getCategoryName() + " - $" + price;
    }
}

class MarketplaceUtil {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discount);
    }
}

public class Marketplace {
    public static void main(String[] args) {
        List<Product<? extends Category>> catalog = new ArrayList<>();

        Product<BookCategory> book = new Product<>("Java Programming", 499.0, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("Cotton Shirt", 799.0, new ClothingCategory());
        Product<GadgetCategory> phone = new Product<>("Smartphone", 19999.0, new GadgetCategory());

        catalog.add(book);
        catalog.add(shirt);
        catalog.add(phone);

        MarketplaceUtil.applyDiscount(book, 10);
        MarketplaceUtil.applyDiscount(shirt, 20);
        MarketplaceUtil.applyDiscount(phone, 15);

        for (Product<? extends Category> p : catalog) {
            System.out.println(p.getDetails());
        }
    }
}
 