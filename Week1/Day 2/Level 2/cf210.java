import java.util.*;
class cf210{
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.print(&quot;Enter the number&quot;);
int number=input.nextInt();
if(number&gt;0 &amp;&amp; number&lt;100){
for(int i=number-1;i&gt;0;i--){
if(number%i==0){
System.out.println(i);
continue;
}
}
}
}
}