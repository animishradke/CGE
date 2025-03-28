import java.util.*;
class meth31{
public static double[] roots(double a,double b,double c){
double delta=Math.pow(b,2)-(4*a*c);
if(delta&gt;0){
double root1=(-b+Math.sqrt(delta))/(2*a);
double root2=(-b-Math.sqrt(delta))/(2*a);
return new double[]{root1,root2};
}
if(delta==0){
double root=-b/(2*a);
return new double[]{root};
}
else{
return new double[0];
}
}
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println(&quot;Enter the values of a,b,c&quot;);
double a=input.nextDouble();
double b=input.nextDouble();
double c=input.nextDouble();
double[] Roots=roots(a, b, c);
if(Roots.length==0){
System.out.println(&quot;No roots are there&quot;);
}
else if(Roots.length==1){
System.out.printf(&quot;The roots of a,b,c in qudratic
equation are %.3f&quot;,Roots[0]);
}
20
else{

18

System.out.printf(&quot;The roots of a,b,c in qudratic equation
are %.3f&quot;,Roots[0],Roots[1]);
}
}
}