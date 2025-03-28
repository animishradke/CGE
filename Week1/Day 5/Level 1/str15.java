import java.util.Scanner;
public class str15 {
public static void generateException(String str) {
char ch = str.charAt(str.length());
System.out.println(&quot;Character at invalid index: &quot; + ch);
}
public static void handleException(String str) {
try {

9

char ch = str.charAt(str.length());
System.out.println(&quot;Character at invalid index: &quot; + ch);
} catch (StringIndexOutOfBoundsException e) {
System.out.println(&quot;Caught Exception: &quot; + e);
}
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String input = sc.nextLine();
handleException(input);
sc.close();
}