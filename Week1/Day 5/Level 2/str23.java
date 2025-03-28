import java.util.*;
public class str23 {
public static int getLength(String s) {
int count = 0;
try {
while (true) {
s.charAt(count);
count++;
}
} catch (Exception e) {
// End of string
}
return count;
}
// Method to split words using charAt()
public static String[] splitIntoWords(String text) {
int len = getLength(text);
int spaceCount = 0;
// Count spaces
for (int i = 0; i &lt; len; i++) {
if (text.charAt(i) == &#39; &#39;) {
spaceCount++;
}
}
int[] spaceIndexes = new int[spaceCount + 1];
int idx = 0;
for (int i = 0; i &lt; len; i++) {
if (text.charAt(i) == &#39; &#39;) {
spaceIndexes[idx++] = i;
}

8

}
spaceIndexes[spaceCount] = len;
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
// Method to create 2D array of word and length
public static String[][] getWordsWithLength(String[] words) {
String[][] result = new String[words.length][2];
for (int i = 0; i &lt; words.length; i++) {
result[i][0] = words[i];
result[i][1] = String.valueOf(getLength(words[i])); // convert
int to String
}
return result;
}
// Main method
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print(&quot;Enter a sentence: &quot;);
String input = sc.nextLine();
String[] words = splitIntoWords(input);
String[][] wordData = getWordsWithLength(words);
// Display in tabular format

9

System.out.println(&quot;\nWord\t\tLength&quot;);
System.out.println(&quot;------------------------&quot;);
for (String[] row : wordData) {
String word = row[0];
int length = Integer.parseInt(row[1]); // convert back to int
System.out.println(word + &quot;\t\t&quot; + length);
}
}
}