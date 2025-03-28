import java.util.*;
Class cf26{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.println(&quot;Enter the number&quot;);
int number=input.nextInt();
for(int i=1;i&lt;=number;i++){
if(number%i==0){
System.out.println(i);
}
}
}
}
}