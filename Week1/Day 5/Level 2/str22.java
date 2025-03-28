import java.util.*;
public class str22 {
public static int getStringLength(String text) {
int count = 0;
try {
while (true) {
text.charAt(count);
count++;
}
} catch (Exception e) {
// End of string reached
}
return count;
}
// Method to split string into words manually using charAt()
public static String[] manualSplit(String text) {
int length = getStringLength(text);

5

int spaceCount = 0;
// Count words (spaces + 1)
for (int i = 0; i &lt; length; i++) {
if (text.charAt(i) == &#39; &#39;) {
spaceCount++;
}
}
int[] spaceIndexes = new int[spaceCount + 1];
int index = 0;
for (int i = 0; i &lt; length; i++) {
if (text.charAt(i) == &#39; &#39;) {
spaceIndexes[index++] = i;
}
}
spaceIndexes[spaceCount] = length;
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
// Method to compare two string arrays
public static boolean compareArrays(String[] a, String[] b) {
if (a.length != b.length) return false;
for (int i = 0; i &lt; a.length; i++) {
if (!a[i].equals(b[i])) return false;
}

6

return true;
}
// Main method
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print(&quot;Enter a sentence: &quot;);
String input = sc.nextLine();
String[] customWords = manualSplit(input);
String[] builtInWords = input.split(&quot; &quot;);
System.out.println(&quot;\nWords from manual split:&quot;);
for (String word : customWords) {
System.out.println(word);
}
System.out.println(&quot;\nWords from built-in split:&quot;);
for (String word : builtInWords) {
System.out.println(word);
}
boolean isEqual = compareArrays(customWords, builtInWords);
System.out.println(&quot;\nDo both methods give the same result? &quot; +
isEqual);
}
}
