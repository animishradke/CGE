import java.util.Scanner;
public class hand5 {

public static String getInput() {
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter a string: &quot;);
return scanner.nextLine();
}

// Function to check if a string is a palindrome
public static boolean isPalindrome(String text) {
text = text.replaceAll(&quot;[^a-zA-Z0-9]&quot;, &quot;&quot;).toLowerCase(); // remove
non-alphanumeric and make lowercase
int left = 0, right = text.length() - 1;
while (left &lt; right) {
if (text.charAt(left) != text.charAt(right)) {
return false;
}
left++;
right--;
}
return true;
}
// Function to display the result
public static void displayResult(String input, boolean isPalindrome) {
if (isPalindrome) {
System.out.println(&quot;\&quot;&quot; + input + &quot;\&quot; is a palindrome.&quot;);
} else {
System.out.println(&quot;\&quot;&quot; + input + &quot;\&quot; is not a palindrome.&quot;);
}
}
public static void main(String[] args) {
String input = getInput();
boolean result = isPalindrome(input);
displayResult(input, result);
}
}