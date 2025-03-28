public class str14 {
public static void generateException() {
String text = null;
System.out.println(&quot;Length: &quot; + text.length());
}
public static void handleException() {
String text = null;
try {
System.out.println(&quot;Length: &quot; + text.length());
} catch (NullPointerException e) {
System.out.println(&quot;Caught NullPointerException: &quot; +
e.getMessage());
}
}
public static void main(String[] args) {
System.out.println(&quot;---- Generating Exception ----&quot;);
try {
generateException();
} catch (NullPointerException e) {
System.out.println(&quot;Handled in main: &quot; + e.getMessage());
}
System.out.println(&quot;\n---- Handling Exception ----&quot;);
handleException();
}
}