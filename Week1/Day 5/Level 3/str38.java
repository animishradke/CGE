import java.util.Scanner;
public class AnagramChecker {

public static boolean isAnagram(String text1, String text2) {
text1 = text1.replaceAll(&quot;\\s&quot;, &quot;&quot;).toLowerCase();
text2 = text2.replaceAll(&quot;\\s&quot;, &quot;&quot;).toLowerCase();
if (text1.length() != text2.length()) {
return false;
}
int[] freq1 = new int[26];
int[] freq2 = new int[26];
for (int i = 0; i &lt; text1.length(); i++) {
freq1[text1.charAt(i) - &#39;a&#39;]++;
freq2[text2.charAt(i) - &#39;a&#39;]++;
}
for (int i = 0; i &lt; 26; i++) {
if (freq1[i] != freq2[i]) {
return false;
}
}
return true;
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter first text: &quot;);
String text1 = scanner.nextLine();
System.out.print(&quot;Enter second text: &quot;);
String text2 = scanner.nextLine();
if (isAnagram(text1, text2)) {
System.out.println(&quot;✅ The texts are anagrams.&quot;);
} else {
System.out.println(&quot;❌ The texts are NOT anagrams.&quot;);
}
scanner.close();
}


}