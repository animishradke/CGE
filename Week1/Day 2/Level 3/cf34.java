class cf34{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.print(&quot;Enter the number&quot;);
int number=input.nextInt();
boolean isPrime=true;
if(number&gt;0){
7
for(int i=2;i&lt;number;i++){
if(number%i==0){
isPrime=false;
break;
}
isPrime=true;
}
if(isPrime){
System.out.println(number+&quot; is a prime number&quot;);
}else{
System.out.println(number+&quot; is not a prime
number&quot;);
}
}
else{
System.out.println(number+&quot; is not a prime number&quot;);
}
}
}