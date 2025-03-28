class cf24{
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.print(&quot;Enter the number&quot;);
int number=input.nextInt();
if(number&gt;0){
for(int i=1;i&lt;=number;i++){
if(number%3==0 &amp;&amp; number%5==0){
System.out.println(&quot;FizzBuzz&quot;);
}
else if(number%5==0){
System.out.println(&quot;Buzz&quot;);
}else if(number%3==0 ){
System.out.println(&quot;Fizz&quot;);
}
else{
System.out.println(&quot;It is not divisible by 3
and 5&quot;);
}
}
}
else{
System.out.println(&quot;It is is invalid number&quot;);
}
}
}