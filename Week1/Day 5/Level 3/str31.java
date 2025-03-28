import java.util.Scanner;
public class str31 {
public static String[] calculateBMIAndStatus(double weight, double
heightCm) {
double heightM = heightCm / 100.0; // Convert cm to meters
double bmi = weight / (heightM * heightM);
String status;
if (bmi &lt; 18.5) {
status = &quot;Underweight&quot;;
} else if (bmi &lt; 25) {

4

status = &quot;Normal&quot;;
} else if (bmi &lt; 30) {
status = &quot;Overweight&quot;;
} else {
status = &quot;Obese&quot;;
}
return new String[] {
String.format(&quot;%.2f&quot;, heightCm),
String.format(&quot;%.2f&quot;, weight),
String.format(&quot;%.2f&quot;, bmi),
status
};
}
// Method to calculate BMI and status for all persons
public static String[][] computeAllBMIs(double[][] data) {
String[][] result = new String[10][4];
for (int i = 0; i &lt; 10; i++) {
double weight = data[i][0];
double height = data[i][1];
result[i] = calculateBMIAndStatus(weight, height);
}
return result;
}
// Method to display the results
public static void displayResults(String[][] result) {
System.out.printf(&quot;%-10s %-10s %-10s %-15s\n&quot;, &quot;Height(cm)&quot;,
&quot;Weight(kg)&quot;, &quot;BMI&quot;, &quot;Status&quot;);
System.out.println(&quot;-----------------------------------------------
------&quot;);
for (int i = 0; i &lt; result.length; i++) {
System.out.printf(&quot;%-10s %-10s %-10s %-15s\n&quot;,
result[i][0], result[i][1], result[i][2], result[i][3]);
}
}
// Main method

5

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
double[][] inputData = new double[10][2];
System.out.println(&quot;Enter height (in cm) and weight (in kg) for 10
persons:&quot;);
for (int i = 0; i &lt; 10; i++) {
System.out.printf(&quot;Person %d:\n&quot;, i + 1);
System.out.print(&quot; Height (cm): &quot;);
inputData[i][1] = scanner.nextDouble();
System.out.print(&quot; Weight (kg): &quot;);
inputData[i][0] = scanner.nextDouble();
}
String[][] resultData = computeAllBMIs(inputData);
System.out.println(&quot;\nBMI Report:&quot;);
displayResults(resultData);
}
}