import java.util.Scanner;
import java.util.Random;


public class str28 {
public static int[] generateAges(int n) {
Random rand = new Random();
int[] ages = new int[n];
for (int i = 0; i &lt; n; i++) {
ages[i] = rand.nextInt(90) + 10; // 2-digit random age (10-99)
}
return ages;
}
public static String[][] checkVotingEligibility(int[] ages) {
String[][] result = new String[ages.length][2];
for (int i = 0; i &lt; ages.length; i++) {
result[i][0] = Integer.toString(ages[i]);
if (ages[i] &lt; 0) {
result[i][1] = &quot;false&quot;;
} else if (ages[i] &gt;= 18) {
result[i][1] = &quot;true&quot;;
} else {
result[i][1] = &quot;false&quot;;
}
}
return result;
}
public static void displayResults(String[][] results) {
System.out.printf(&quot;%-10s %-15s%n&quot;, &quot;Age&quot;, &quot;Can Vote&quot;);
System.out.println(&quot;-------------------------&quot;);
for (int i = 0; i &lt; results.length; i++) {
System.out.printf(&quot;%-10s %-15s%n&quot;, results[i][0],
results[i][1]);
}
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int numberOfStudents = 10;
int[] studentAges = generateAges(numberOfStudents);
String[][] eligibility = checkVotingEligibility(studentAges);
displayResults(eligibility);

19

sc.close();
}