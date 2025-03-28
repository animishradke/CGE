import java.util.*;
class meth29{
public static boolean isPostive(int numbers){
if(numbers&lt;0){
return false;
}
return true;
15

14

}
public static boolean isPrime(int numbers){
if(numbers&lt;0){
return false;
}
for(int i=2;i&lt;Math.sqrt(numbers);i++){
if(numbers%i==0){
return false;
}
}
return true;
}
public static void Compare(int firstNumber,int
LastNumber){
if(firstNumber&gt;LastNumber){
System.out.println(&quot;First number is greater&quot;);
}
else if(firstNumber==LastNumber){
System.out.println(&quot;First number and Last
number both are equal&quot;);
}
else{
System.out.println(&quot;Last number is greater&quot;);
}
}
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
int[] number=new int[5];
for(int i=0;i&lt;number.length;i++){
System.out.println(&quot;Enter the number of index
&quot;+i);
16
number[i]=input.nextInt();
}
int
firstNumber=number[0],LastNumber=number[number.length-1];
for(int i=0;i&lt;number.length;i++){
boolean result=isPostive(number[i]);
if(result){
System.out.println(&quot;The &quot;+number[i]+&quot; is
positive&quot;);
boolean res=isPrime(number[i]);

15

if(res){
System.out.println(&quot;The &quot;+number[i]+&quot; is a
prime number&quot;);
}
}
}
Compare(firstNumber,LastNumber);
}
}