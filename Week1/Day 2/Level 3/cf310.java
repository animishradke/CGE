import java.util.*;
class cf310{
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.print(&quot;Enter first number&quot;);
double first=input.nextDouble();
System.out.print(&quot;Enter second number&quot;);
double second=input.nextDouble();
System.out.print(&quot;Enter the operation in +,-,/,*&quot;);
input.nextLine();
String op=input.nextLine();
switch (op) {
case &quot;+&quot;:
System.out.println(first+second);

13

break;
case &quot;-&quot;:
System.out.println(second-first);
break;
case &quot;*&quot;:
System.out.println(first*second);
break;
case &quot;/&quot;:
System.out.println(second/first);
break;
default:
System.out.println(&quot;Invalid Operator&quot;);
}
}
}