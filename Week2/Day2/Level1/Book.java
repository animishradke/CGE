class Book{
private String title;
private String author;
private int price;


public Book(String title,String author,int price){
this.title=title;
this.author=author;
this.price=price;
}

public void display(){
 System.out.println("Enter the title:"+title);
  System.out.println("Enter the author:"+author);
  System.out.println("Enter the price:"+price);
   System.out.println("-----------------------");
}

public static void main(String[] args){
  Book book1=new Book("hari","physics",210);
Book book2=new Book("harsh","physics",310);

     book1.display();
	  book2.display();
}








}