import java.util.*;
import java.util.*;
class cf35{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.print(&quot;Enter the number&quot;);
int number=input.nextInt();
int num=number;
int result;
int sum=0;
while(num&gt;0){
result=num%10;
sum+=result*result*result;
num=num/10;
}
if(sum==number){
System.out.println(&quot;It is an ArmStrong number&quot;);
}else{
System.out.println(&quot;It is not an ArmStrong number&quot;);
}
}