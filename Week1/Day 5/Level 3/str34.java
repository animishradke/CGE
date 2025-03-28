import java.util.Scanner;
public class str34{
// Method to calculate character frequencies
public static String[][] getCharFrequencies(String text) {
int[] freq = new int[256]; // Frequency array for ASCII characters
// Count frequency using charAt()
for (int i = 0; i &lt; text.length(); i++) {
char ch = text.charAt(i);
freq[ch]++;
}
// Count how many unique characters we have (for 2D array size)
int uniqueCount = 0;
for (int i = 0; i &lt; 256; i++) {
if (freq[i] &gt; 0) {
uniqueCount++;
}
}
// Create 2D array to hold characters and their frequencies
String[][] result = new String[uniqueCount][2];
int index = 0;
for (int i = 0; i &lt; 256; i++) {
if (freq[i] &gt; 0) {
result[index][0] = Character.toString((char) i);
result[index][1] = Integer.toString(freq[i]);
index++;
}

10

}
return result;
}
// Method to display results
public static void displayFrequencies(String[][] freqTable) {
System.out.printf(&quot;%-10s%-10s\n&quot;, &quot;Character&quot;, &quot;Frequency&quot;);
System.out.println(&quot;----------------------&quot;);
for (String[] row : freqTable) {
System.out.printf(&quot;%-10s%-10s\n&quot;, row[0], row[1]);
}
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter a string: &quot;);
String input = scanner.nextLine().replaceAll(&quot;\\s&quot;,
&quot;&quot;).toLowerCase();
String[][] result = getCharFrequencies(input);
System.out.println(&quot;\nCharacter Frequency Table:&quot;);
displayFrequencies(result);
scanner.close();
}
}