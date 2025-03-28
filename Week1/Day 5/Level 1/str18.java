public class ArrayExceptionDemo {
public static void generateException(String[] names, int index) {
System.out.println(&quot;\n-- Generating Exception (No try-catch) --&quot;);
System.out.println(&quot;Accessing index &quot; + index + &quot;: &quot; +
names[index]); // May throw exception
}
public static void handleException(String[] names, int index) {
System.out.println(&quot;\n-- Handling Exception (With try-catch) --&quot;);
try {
System.out.println(&quot;Accessing index &quot; + index + &quot;: &quot; +
names[index]);
} catch (ArrayIndexOutOfBoundsException e) {
System.out.println(&quot;Caught ArrayIndexOutOfBoundsException: &quot; +
e.getMessage());
} catch (RuntimeException e) {
System.out.println(&quot;Caught generic RuntimeException: &quot; +
e.getMessage());
}
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String[] names = { &quot;Alice&quot;, &quot;Bob&quot;, &quot;Charlie&quot;, &quot;David&quot; };
System.out.println(&quot;Array length is: &quot; + names.length);
System.out.print(&quot;Enter an index to access (e.g., 0 to 5): &quot;);
int index = scanner.nextInt();


handleException(names, index);
scanner.close();
}
}