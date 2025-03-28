import java.util.Scanner;
public class meth38 {
static String getMonthName(int month) {
String[] months = {
&quot;&quot;, &quot;January&quot;, &quot;February&quot;, &quot;March&quot;, &quot;April&quot;, &quot;May&quot;, &quot;June&quot;,
&quot;July&quot;, &quot;August&quot;, &quot;September&quot;, &quot;October&quot;, &quot;November&quot;,
&quot;December&quot;
};
return months[month];
}
static boolean isLeapYear(int year) {
return (year % 4 == 0 &amp;&amp; year % 100 != 0) || (year % 400 == 0);
}
static int getNumberOfDays(int month, int year) {
int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
if (month == 2 &amp;&amp; isLeapYear(year))
return 29;
return days[month];
}
static int getStartDay(int day, int month, int year) {

19

int y = year - (14 - month) / 12;
int x = y + y / 4 - y / 100 + y / 400;
int m = month + 12 * ((14 - month) / 12) - 2;
return (day + x + (31 * m) / 12) % 7;
}
static void printCalendar(int month, int year) {
System.out.println(&quot;\n &quot; + getMonthName(month) + &quot; &quot; + year);
System.out.println(&quot; Sun Mon Tue Wed Thu Fri Sat&quot;);
int startDay = getStartDay(1, month, year);
int totalDays = getNumberOfDays(month, year);
for (int i = 0; i &lt; startDay; i++) {
System.out.print(&quot; &quot;);
}
for (int day = 1; day &lt;= totalDays; day++) {
System.out.printf(&quot;%4d&quot;, day);
if ((day + startDay) % 7 == 0 || day == totalDays) {
System.out.println();
}
}
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print(&quot;Enter month (1-12): &quot;);
int month = sc.nextInt();
System.out.print(&quot;Enter year: &quot;);
int year = sc.nextInt();
printCalendar(month, year);
}
}