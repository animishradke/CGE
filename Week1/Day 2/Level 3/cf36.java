import java.util.*;
class cf36{
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.print(&quot;Enter the number&quot;);
int number=input.nextInt();
int count=0;
int num=number;
while(num&gt;0){
num=num/10;
count++;
}
System.out.println(count);
}
}