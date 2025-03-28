import java.util.*;
class cf31{
public static void main(String[] args) {
Scanner input=new Scanner(System.in)
; System.out.println(&quot;Enter the year&quot;);
int year=input.nextInt(); if(year&gt;=1582 &amp;&amp; (year%4==0 &amp;&amp; year%100!=0 ||
year%400==0) ){
System.out.println(year +&quot; is a Leap Year&quot;);
} else{
System.out.print(&quot;Not a Leap year&quot;);
}
}
}