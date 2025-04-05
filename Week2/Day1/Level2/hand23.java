import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class hand23{
public static void main(String[] args) {
LocalDate currentDate = LocalDate.now();
DateTimeFormatter format1 =
DateTimeFormatter.ofPattern(&quot;dd/MM/yyyy&quot;);
DateTimeFormatter format2 = DateTimeFormatter.ofPattern(&quot;yyyy-MM-
dd&quot;);
DateTimeFormatter format3 = DateTimeFormatter.ofPattern(&quot;EEE, MMM
dd, yyyy&quot;);
System.out.println(&quot;Format 1 (dd/MM/yyyy): &quot; +

currentDate.format(format1));
System.out.println(&quot;Format 2 (yyyy-MM-dd): &quot; +
currentDate.format(format2));
System.out.println(&quot;Format 3 (EEE, MMM dd, yyyy): &quot; +
currentDate.format(format3));
}
}