public static void generateException(String text) {
int number = Integer.parseInt(text);
System.out.println(&quot;Converted Number: &quot; + number);
}
public static void handleException(String text) {
try {
int number = Integer.parseInt(text);
System.out.println(&quot;Converted Number: &quot; + number);
} catch (NumberFormatException e) {
System.out.println(&quot;Caught NumberFormatException: &quot; + e);
} catch (RuntimeException e) {
System.out.println(&quot;Caught RuntimeException: &quot; + e);
}
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String input = sc.nextLine();
// generateException(input);
handleException(input);
sc.close();
}
}