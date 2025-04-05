class MobilePhone {
private String brand;
private String model;
private double price;

public MobilePhone(String brand, String model, double price) {
this.brand = brand;
this.model = model;
this.price = price;
}
public void displayDetails() {
System.out.println(&quot;Brand: &quot; + brand);
System.out.println(&quot;Model: &quot; + model);
System.out.println(&quot;Price: $&quot; + price);
System.out.println(&quot;---------------------------&quot;);
}
public static void main(String[] args) {
MobilePhone phone1 = new MobilePhone(&quot;Apple&quot;, &quot;iPhone 14&quot;, 999.99);
MobilePhone phone2 = new MobilePhone(&quot;Samsung&quot;, &quot;Galaxy S23&quot;,
799.99);
phone1.displayDetails();
phone2.displayDetails();
}
}