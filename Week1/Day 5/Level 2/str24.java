import java.util.*;
public class str24 {
// Method to get string length without using .length()
public static int getLength(String s) {
int count = 0;
try {
while (true) {
s.charAt(count);
count++;
}
} catch (Exception e) {
// Do nothing, just end the loop
}
return count;

10

}
// Method to split input into words using charAt()
public static String[] splitIntoWords(String text) {
int len = getLength(text);
int spaceCount = 0;
// Count the number of spaces
for (int i = 0; i &lt; len; i++) {
if (text.charAt(i) == &#39; &#39;) {
spaceCount++;
}
}
// Store space positions + end of string
int[] spaceIndexes = new int[spaceCount + 1];
int idx = 0;
for (int i = 0; i &lt; len; i++) {
if (text.charAt(i) == &#39; &#39;) {
spaceIndexes[idx++] = i;
}
}
spaceIndexes[spaceCount] = len; // end of string
String[] words = new String[spaceCount + 1];
int start = 0;
for (int i = 0; i &lt;= spaceCount; i++) {
int end = spaceIndexes[i];
StringBuilder word = new StringBuilder();
for (int j = start; j &lt; end; j++) {
word.append(text.charAt(j));
}
words[i] = word.toString();
start = end + 1;
}
return words;
}
// Method to build 2D array of words and their lengths
public static String[][] getWordsWithLengths(String[] words) {
String[][] result = new String[words.length][2];
for (int i = 0; i &lt; words.length; i++) {

11

result[i][0] = words[i];
result[i][1] = String.valueOf(getLength(words[i]));
}
return result;
}
// Method to find shortest and longest word based on lengths
public static int[] findShortestAndLongest(String[][] wordData) {
int minLength = Integer.parseInt(wordData[0][1]);
int maxLength = Integer.parseInt(wordData[0][1]);
int minIndex = 0;
int maxIndex = 0;
for (int i = 1; i &lt; wordData.length; i++) {
int len = Integer.parseInt(wordData[i][1]);
if (len &lt; minLength) {
minLength = len;
minIndex = i;
}
if (len &gt; maxLength) {
maxLength = len;
maxIndex = i;
}
}
return new int[]{minIndex, maxIndex};
}
// Main function
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter your text: &quot;);
String input = scanner.nextLine();
String[] words = splitIntoWords(input);
String[][] wordData = getWordsWithLengths(words);
int[] result = findShortestAndLongest(wordData);
System.out.println(&quot;\nWord\t\tLength&quot;);
System.out.println(&quot;------------------------&quot;);
for (String[] row : wordData) {
System.out.println(row[0] + &quot;\t\t&quot; + Integer.parseInt(row[1]));

12

}
System.out.println(&quot;\nShortest word: &quot; + word