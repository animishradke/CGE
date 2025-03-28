import java.util.*;
class cf2112{
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.print(&quot;Enter the number&quot;);
int number=input.nextInt();
int i=number;

12

if(number&gt;0 &amp;&amp; number&lt;100){
while(i&gt;0){
if(number%i==0){
System.out.println(i);
}
i--;
continue;
}
}
}