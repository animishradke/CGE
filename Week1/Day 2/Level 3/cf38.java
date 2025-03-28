Harshad Number.
import java.util.*;
class cf38{
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println(&quot;Enter the number&quot;);

11

int number=input.nextInt();
int sum=0;
int num=number;
while(num&gt;0){
num=num%10;
sum+=num;
num=num/10;
}
if(number%sum==0){
System.out.println(&quot;Harshad number&quot;);
}
else{
System.out.println(&quot;Not Harsha number&quot;);
}
}
}