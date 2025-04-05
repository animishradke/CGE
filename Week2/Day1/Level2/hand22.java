import java.time.LocalDate;
import java.util.Scanner;

public class hand22{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter date (yyyy-MM-dd): &quot;);
String input = scanner.nextLine();

LocalDate date = LocalDate.parse(input);
LocalDate modifiedDate =
date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

System.out.println(&quot;Final Date: &quot; + modifiedDate);
}
}