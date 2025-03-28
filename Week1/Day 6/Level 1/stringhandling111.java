import java.util.Arrays;
import java.util.Scanner;
public class stringhandling111{
public static boolean areAnagrams(String str1, String str2) {
if (str1 == null || str2 == null || str1.length() != str2.length())
{
return false;
}
char[] charArray1 = str1.toCharArray();
char[] charArray2 = str2.toCharArray();
Arrays.sort(charArray1);
Arrays.sort(charArray2);
return Arrays.equals(charArray1, charArray2);
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter first string: &quot;);
String str1 = scanner.nextLine();
System.out.print(&quot;Enter second string: &quot;);
String str2 = scanner.nextLine();

if (areAnagrams(str1, str2)) {
System.out.println(&quot;The strings are anagrams.&quot;);
} else {
System.out.println(&quot;The strings are not anagrams.&quot;);
}
scanner.close();
}
}