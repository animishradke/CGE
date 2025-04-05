public class Book {
static String libraryName = &quot;City Central Library&quot;
private final String isbn;
private String title;
private String author;
public Book(String title, String author, String isbn) {
this.title = title;
this.author = author;
this.isbn = isbn;
}
public static void displayLibraryName() {
System.out.println(&quot;Library Name: &quot; + libraryName);
}
public void displayBookDetails() {
if (this instanceof Book) {
System.out.println(&quot;Title : &quot; + title);
System.out.println(&quot;Author: &quot; + author);
System.out.println(&quot;ISBN : &quot; + isbn);
} else {
System.out.println(&quot;Invalid object, not a Book instance.&quot;);

}
}
}