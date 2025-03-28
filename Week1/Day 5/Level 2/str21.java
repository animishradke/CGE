import java.util.Scanner;
public class str21{
public static int getLengthWithoutUsingLength(String str) {
int count = 0;
try {
while (true) {
str.charAt(count);
count++;
}
} catch (StringIndexOutOfBoundsException e) {
}
return count;
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter a string: &quot;);
String input = scanner.next();
int manualLength = getLengthWithoutUsingLength(input);
int builtInLength = input.length();
System.out.println(&quot;Length (manual): &quot; + manualLength);
System.out.println(&quot;Length (built-in): &quot; + builtInLength);
}

4

}