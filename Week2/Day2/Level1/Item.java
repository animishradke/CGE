class Item{
private int itemCode;
private String itemName;
private int price;

public Item(int itemCode,String itemName,int price){
this.itemCode=itemCode;
this.itemName=itemName;
this.price=price;
}
public void display(){
System.out.println("The ItemCode is:"+ itemCode);
System.out.println("The ItemName is:"+ itemName);
System.out.println("The Price is:"+ price);
System.out.println("---------------------------");
}

public int calculateTotalCost(int quantity){
	return price*quantity;
}

public static void main(String[] args){
   Item item1=new Item(101,"Apple",100);
   Item item2=new Item(101,"Apple",100);
   
   item1.display();
    System.out.println("Total cost for 5 Apples: " + item1.calculateTotalCost(5));
    System.out.println("---------------------------");
   item2.display();
    System.out.println("Total cost for 5 bananas: " + item2.calculateTotalCost(5));
    System.out.println("---------------------------");
}
}