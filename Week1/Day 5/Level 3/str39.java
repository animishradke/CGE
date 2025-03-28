import java.util.Scanner;
public class str39 {
// Get month name from month number
public static String getMonthName(int month) {
String[] months = {
&quot;January&quot;, &quot;February&quot;, &quot;March&quot;, &quot;April&quot;, &quot;May&quot;, &quot;June&quot;,

19

&quot;July&quot;, &quot;August&quot;, &quot;September&quot;, &quot;October&quot;, &quot;November&quot;,
&quot;December&quot;
};
return months[month - 1];
}
// Check if a year is a leap year
public static boolean isLeapYear(int year) {
return (year % 4 == 0 &amp;&amp; year % 100 != 0) || (year % 400 == 0);
}
public static int getNumberOfDaysInMonth(int month, int year) {
int[] days = { 31, 28, 31, 30, 31, 30,
31, 31, 30, 31, 30, 31 };
if (month == 2 &amp;&amp; isLeapYear(year)) {
return 29;
}
return days[month - 1];
}
public static int getFirstDayOfMonth(int month, int year) {
int d = 1; // day = 1st
int y0 = year - (14 - month) / 12;
int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
int m0 = month + 12 * ((14 - month) / 12) - 2;
int d0 = (d + x + (31 * m0) / 12) % 7;
return d0;
}public static void printCalendar(int month, int year) {
String monthName = getMonthName(month);
int daysInMonth = getNumberOfDaysInMonth(month, year);
int startDay = getFirstDayOfMonth(month, year);
System.out.println(&quot;\n &quot; + monthName + &quot; &quot; + year);
System.out.println(&quot;Sun Mon Tue Wed Thu Fri Sat&quot;);
// Indent first day
for (int i = 0; i &lt; startDay; i++) {

20

System.out.print(&quot; &quot;);
}
// Print all days
for (int day = 1; day &lt;= daysInMonth; day++) {
System.out.printf(&quot;%3d &quot;, day);
if ((day + startDay) % 7 == 0) {
System.out.println();
}
}
System.out.println(); // Final newline
}
// Main method
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter month (MM): &quot;);
int month = scanner.nextInt();
System.out.print(&quot;Enter year (YYYY): &quot;);
int year = scanner.nextInt();
printCalendar(month, year);
scanner.close();
}
}