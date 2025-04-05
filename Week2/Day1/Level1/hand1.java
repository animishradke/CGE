import java.util.Random;
import java.util.Scanner;
public class hand1{
public static int generateGuess(int low, int high) {
Random random = new Random();
return random.nextInt(high - low + 1) + low;
}
public static String getUserFeedback() {
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Is the guess high, low, or correct? (h/l/c): &quot;);
return scanner.nextLine().toLowerCase();
}
public static void playGame() {
Scanner scanner = new Scanner(System.in);
int low = 1;
int high = 100;
int guess;
String feedback;
System.out.println(&quot;Think of a number between 1 and 100, and I&#39;ll
try to guess it.&quot;);
System.out.println(&quot;You can tell me if the guess is high (h), low
(l), or correct (c).&quot;);
while (true) {
guess = generateGuess(low, high);
System.out.println(&quot;My guess is: &quot; + guess);
feedback = getUserFeedback();

if (feedback.equals(&quot;c&quot;)) {
System.out.println(&quot;Yay! I guessed your number
correctly!&quot;);
break;
} else if (feedback.equals(&quot;h&quot;)) {
high = guess - 1; // Guess was too high, so reduce the
range
} else if (feedback.equals(&quot;l&quot;)) {
low = guess + 1; // Guess was too low, so increase the
range
} else {
System.out.println(&quot;Invalid input. Please enter &#39;h&#39;, &#39;l&#39;,
or &#39;c&#39;.&quot;);
}
}
}
public static void main(String[] args) {
playGame();
}
}