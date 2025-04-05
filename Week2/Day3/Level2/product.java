class Product {
String productName;
double price;
static int totalProducts = 0;
Product(String productName, double price) {
this.productName = productName;
this.price = price;
totalProducts++;
}
void displayProductDetails() {
System.out.println(&quot;Product Name: &quot; + productName);
System.out.println(&quot;Price: $&quot; + price);
}
static void displayTotalProducts() {
System.out.println(&quot;Total Products: &quot; + totalProducts);
}
}