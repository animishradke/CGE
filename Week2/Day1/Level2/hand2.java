import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
public class hand21{
public static void main(String[] args) {
DateTimeFormatter formatter = DateTimeFormatter.ofPattern(&quot;dd-MM-
yyyy HH:mm:ss z&quot;);
ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of(&quot;GMT&quot;));
System.out.println(&quot;Current Time in GMT: &quot; +
gmtTime.format(formatter));
ZonedDateTime istTime =
ZonedDateTime.now(ZoneId.of(&quot;Asia/Kolkata&quot;));
System.out.println(&quot;Current Time in IST: &quot; +
istTime.format(formatter));
ZonedDateTime pstTime =
ZonedDateTime.now(ZoneId.of(&quot;America/Los_Angeles&quot;));
System.out.println(&quot;Current Time in PST: &quot; +
pstTime.format(formatter));
}
}