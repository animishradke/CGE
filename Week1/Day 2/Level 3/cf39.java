import java.util.*;
class cf39{
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.print(&quot;Enter the number&quot;);
int num=input.nextInt();
int sum=0;

12

for(int i=1;i&lt;num;i++){
if(num%i==0){
sum+=i;
}
}
if(sum&gt;num){
System.out.println(num+&quot; is an Abaundant number&quot;);
}
else{
System.out.println(num+&quot; is not an Abaundant number&quot;);
}
}
}