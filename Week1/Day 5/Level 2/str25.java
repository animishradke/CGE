import java.util.Scanner;
public class str25 {
letter
public static String checkCharacterType(char ch) {

if (ch &gt;= &#39;A&#39; &amp;&amp; ch &lt;= &#39;Z&#39;) {
ch = (char)(ch + 32); // Convert uppercase to lowercase
}
if (ch &gt;= &#39;a&#39; &amp;&amp; ch &lt;= &#39;z&#39;) {
if (ch == &#39;a&#39; || ch == &#39;e&#39; || ch == &#39;i&#39; || ch == &#39;o&#39; || ch ==
&#39;u&#39;) {
return &quot;Vowel&quot;;
} else {
return &quot;Consonant&quot;;
}
}

return &quot;Not a Letter&quot;;
}
// Method to find count of vowels and consonants
public static int[] countVowelsAndConsonants(String input) {
int vowels = 0;
int consonants = 0;
for (int i = 0; i &lt; input.length(); i++) {
char ch = input.charAt(i);
String result = checkCharacterType(ch);
if (result.equals(&quot;Vowel&quot;)) {
vowels++;
} else if (result.equals(&quot;Consonant&quot;)) {
consonants++;
}
}
return new int[]{vowels, consonants};
}
// Main method to get input and display the result
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print(&quot;Enter a string: &quot;);
String userInput = sc.nextLine();
int[] result = countVowelsAndConsonants(userInput);
System.out.println(&quot;Number of Vowels: &quot; + result[0]);
System.out.println(&quot;Number of Consonants: &quot; + result[1]);
sc.close();
}
}