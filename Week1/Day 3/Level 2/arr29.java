import java.util.Scanner;
public class arr29 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter the number of students: &quot;);
int n = scanner.nextInt();
int[][] marks = new int[n][3];
double[] percentages = new double[n];
char[] grades = new char[n];
for (int i = 0; i &lt; n; i++) {
System.out.println(&quot;Enter marks for student &quot; + (i + 1) + &quot;
(Physics, Chemistry, Maths):&quot;);
for (int j = 0; j &lt; 3; j++) {

16

marks[i][j] = scanner.nextInt();
while (marks[i][j] &lt; 0) {
System.out.println(&quot;Marks cannot be negative. Enter
again:&quot;);
marks[i][j] = scanner.nextInt();
}
}
int total = marks[i][0] + marks[i][1] + marks[i][2];
percentages[i] = total / 3.0;
if (percentages[i] &gt;= 90) grades[i] = &#39;A&#39;;
else if (percentages[i] &gt;= 80) grades[i] = &#39;B&#39;;
else if (percentages[i] &gt;= 70) grades[i] = &#39;C&#39;;
else if (percentages[i] &gt;= 60) grades[i] = &#39;D&#39;;
else grades[i] = &#39;F&#39;;
}
System.out.println(&quot;\nStudent Results:&quot;);
for (int i = 0; i &lt; n; i++) {
System.out.println(&quot;Student &quot; + (i + 1) + &quot; - Percentage: &quot; +
percentages[i] + &quot;%, Grade: &quot; + grades[i]);
}
}
}