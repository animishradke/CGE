import java.util.Scanner;
import java.util.Random;
public class meth312{
public static int[][] generateScores(int numberOfStudents) {
int[][] scores = new int[numberOfStudents][3];
Random rand = new Random();
for (int i = 0; i &lt; numberOfStudents; i++) {
scores[i][0] = 10 + rand.nextInt(90);
scores[i][1] = 10 + rand.nextInt(90);
scores[i][2] = 10 + rand.nextInt(90);
}
return scores;
}
public static double[][] calculateResults(int[][] scores) {
int n = scores.length;
double[][] results = new double[n][3];
for (int i = 0; i &lt; n; i++) {
int total = scores[i][0] + scores[i][1] + scores[i][2];
double avg = total / 3.0;
double percent = (total / 300.0) * 100;
results[i][0] = Math.round(total * 100.0) / 100.0;
results[i][1] = Math.round(avg * 100.0) / 100.0;
results[i][2] = Math.round(percent * 100.0) / 100.0;
}
return results;
}
public static void displayScorecard(int[][] scores, double[][] results)
{
System.out.println(&quot;ID\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentag
e&quot;);
for (int i = 0; i &lt; scores.length; i++) {
System.out.print((i + 1) + &quot;\t&quot;);

25

for (int j = 0; j &lt; 3; j++) {
System.out.print(scores[i][j] + &quot;\t\t&quot;);
}
System.out.print((int)results[i][0] + &quot;\t&quot;);
System.out.print(results[i][1] + &quot;\t&quot;);
System.out.println(results[i][2] + &quot;%&quot;);
}
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter number of students: &quot;);
int numberOfStudents = scanner.nextInt();
int[][] scores = generateScores(numberOfStudents);
double[][] results = calculateResults(scores);
displayScorecard(scores, results);
}
}