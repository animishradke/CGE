import java.util.Scanner;
public class str16 {
public static void generateException(String text) {
String sub = text.substring(5, 2);
System.out.println(&quot;Substring: &quot; + sub);
}
public static void handleException(String text) {
try {
String sub = text.substring(5, 2);
System.out.println(&quot;Substring: &quot; + sub);
} catch (IllegalArgumentException e) {
System.out.println(&quot;Caught IllegalArgumentException: &quot; + e);
} catch (RuntimeException e) {
System.out.println(&quot;Caught RuntimeException: &quot; + e);
}
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String input = sc.nextLine();
handleException(input);
sc.close();
}
}