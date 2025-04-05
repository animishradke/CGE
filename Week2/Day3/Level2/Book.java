class Book {
public String ISBN;
protected String title;
private String author;
public Book(String ISBN, String title, String author) {
this.ISBN = ISBN;
this.title = title;
this.author = author;
}
public void setAuthor(String author) {
this.author = author;
}
public String getAuthor() {
return author;
}
}
class EBook extends Book {
private String fileFormat;
public EBook(String ISBN, String title, String author, String
fileFormat) {
super(ISBN, title, author);
this.fileFormat = fileFormat;
}

public void displayInfo() {
System.out.println(&quot;E-Book ISBN: &quot; + ISBN);
System.out.println(&quot;Title: &quot; + title);
System.out.println(&quot;Author: &quot; + getAuthor());
System.out.println(&quot;Format: &quot; + fileFormat);
}
}
public class LibrarySystem {
public static void main(String[] args) {
EBook ebook = new EBook(&quot;978-3-16-148410-0&quot;, &quot;Java Programming&quot;,
&quot;John Doe&quot;, &quot;PDF&quot;);
ebook.displayInfo();
}
}