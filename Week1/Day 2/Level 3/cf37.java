import java.util.*;
class cf37{
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println(&quot;Enter your weight in kg&quot;);
double weight=input.nextDouble();
System.out.println(&quot;Enter the height in cm&quot;);
double height=input.nextDouble();
double heightinM=height*0.01;
double bmi=weight/(heightinM*heightinM);
if(bmi&lt;=18.4){
System.out.println(&quot;Underweight&quot;);
}else if(bmi&gt;=18.5 &amp;&amp; bmi&lt;=24.9){
System.out.println(&quot;Normal&quot;);
}else if(bmi&gt;=25.0 &amp;&amp; bmi&lt;=39.9){
System.out.println(&quot;Overweight&quot;);
}else{
System.out.println(&quot;Obese&quot;);
}
}
}