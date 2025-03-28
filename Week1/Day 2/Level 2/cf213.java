import java.util.*;
class cf213{
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.print(&quot;Enter the number and power&quot;);
int number=input.nextInt();
int power=input.nextInt();
int result=1;
while(power&gt;0){
result*=number;
power--;
}
System.out.println(result);
}
}