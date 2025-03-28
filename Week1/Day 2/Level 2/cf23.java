import java.util.*;
class cf23{
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.print(&quot;Enter the number&quot;);
int number=input.nextInt();
if(number&gt;=6 &amp;&amp; number&lt;=9){
for(int i=1;i&lt;=10;i++){
System.out.println(number +&quot; X &quot;+ i +&quot; = &quot;+ number*i);
}
}
}
}