import java.util.ArrayList;
import java.util.Scanner;
class CartItem {
String itemName;
double price;
int quantity;
CartItem(String itemName, double price, int quantity) {
this.itemName = itemName;
this.price = price;
this.quantity = quantity;
}
double getTotal() {
return price * quantity;
}

}
class ShoppingCart {
ArrayList&lt;CartItem&gt; cart = new ArrayList&lt;&gt;();
void addItem(String name, double price, int quantity) {
cart.add(new CartItem(name, price, quantity));
}
void removeItem(String name) {
cart.removeIf(item -&gt; item.itemName.equalsIgnoreCase(name));
}
void displayTotalCost() {
double total = 0;
for (CartItem item : cart) {
total += item.getTotal();
}
System.out.printf(&quot;Total Cost: %.2f\n&quot;, total);
}
void displayCart() {
for (CartItem item : cart) {
System.out.println(item.itemName + &quot; - Price: &quot; + item.price +
&quot;, Quantity: &quot; + item.quantity);
}
}
}
public class ShoppingCartApp {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
ShoppingCart cart = new ShoppingCart();
while (true) {
System.out.println(&quot;\n1. Add Item\n2. Remove Item\n3. View
Cart\n4. Total Cost\n5. Exit&quot;);
int choice = sc.nextInt();
sc.nextLine();
switch (choice) {
case 1:

System.out.print(&quot;Enter item name: &quot;);
String name = sc.nextLine();
System.out.print(&quot;Enter price: &quot;);
double price = sc.nextDouble();
System.out.print(&quot;Enter quantity: &quot;);
int qty = sc.nextInt();
cart.addItem(name, price, qty);
break;
case 2:
System.out.print(&quot;Enter item name to remove: &quot;);
String removeName = sc.nextLine();
cart.removeItem(removeName);
break;
case 3:
cart.displayCart();
break;
case 4:
cart.displayTotalCost();
break;
case 5:
return;
}
}
}
}