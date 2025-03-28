import java.util.*;
class cf211{
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.print(&quot;Enter the number and power&quot;);
int number=input.nextInt();
int power=input.nextInt();
int result=1;
if(number&gt;0){
for(int i=1;i&lt;=power;i++){
result*=number;
}
System.out.println(result);
}
}
}