public class hand24{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter first date (yyyy-MM-dd): &quot;);
String firstInput = scanner.nextLine();
System.out.print(&quot;Enter second date (yyyy-MM-dd): &quot;);
String secondInput = scanner.nextLine();
LocalDate firstDate = LocalDate.parse(firstInput);

LocalDate secondDate = LocalDate.parse(secondInput);
if (firstDate.isBefore(secondDate)) {
System.out.println(&quot;The first date is before the second
date.&quot;);
} else if (firstDate.isAfter(secondDate)) {
System.out.println(&quot;The first date is after the second date.&quot;);
} else if (firstDate.isEqual(secondDate)) {
System.out.println(&quot;Both dates are the same.&quot;);
}
}
}