import java.util.*;
class meth30{
public static String[] BMIStatus(double[][] data){
String[] status=new String[data.length];
for(int i=0;i&lt;data.length;i++){
double bmi=data[i][2];
if(bmi&lt;=18.4){
status[i]=&quot;Underweight&quot;;
}
else if(bmi&gt;=18.5 &amp;&amp; bmi&lt;=24.9){
status[i]=&quot;Normal&quot;;

}
else if(bmi&gt;=25.0 &amp;&amp; bmi&lt;=39.9){
status[i]=&quot;OverWeight&quot;;
}
else{
status[i]=&quot;obese&quot;;
}
}
return status;
}
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
double[][] data=new double[10][3];
for(int i=0;i&lt;10;i++){
System.out.println(&quot;Enter the weight of person
&quot;+(i+1));
&quot;+(i+1));
}
}
data[i][0]=input.nextDouble();
System.out.println(&quot;Enter the height of person
data[i][1]=input.nextDouble();
data[i][1]*=0.01;
data[i][2]=(data[i][0])/(data[i][1]*data[i][1]);
}
String[] bmiStatus=BMIStatus(data);
for(int i=0;i&lt;10;i++){
System.out.printf(&quot;The weight is %.3f height is %.3f
and bmi value is %.3f and BMI Status
&quot;,data[i][0],data[i][1],data[i][2],bmiStatus[i]);
}