import java.util.*;
class meth25{
public static double convertYardsToFeet(double yards){
double yards2feet = 3;
return yards*yards2feet;
}
public static double convertFeetToYards(double feet){
double feet2yards = 0.333333;
return feet*feet2yards;
}
public static double convertMeterToInches(double meters){
double meters2inches = 39.3701;
return meters*meters2inches;
}
public static double convertInchesToMeter(double inches){
double inches2meters = 0.0254;
return inches*inches2meters;
}
public static double convertInchesToCentimeters(double inches){
double inches2cm = 2.54;
return inches*inches2cm;
}
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println(&quot;Enter the yards&quot;);
double yards=input.nextDouble();
System.out.printf(&quot;The yards %.3f in feet is %.3f
\n&quot;,yards,convertYardsToFeet(yards));
System.out.println(&quot;Enter the feet&quot;);
double feet=input.nextDouble();
System.out.printf(&quot;The feet %.3f in yards is %.3f
\n&quot;,feet,convertFeetToYards(feet));
System.out.println(&quot;Enter the meters&quot;);
double meter=input.nextDouble();
System.out.printf(&quot;The meters %.3f in inches is %.3f
\n&quot;,meter,convertMeterToInches(meter));
System.out.println(&quot;Enter the inches&quot;);
double inch=input.nextDouble();
System.out.printf(&quot;The inches %.3f in meters is %.3f
\n&quot;,inch,convertInchesToMeter(inch));
System.out.printf(&quot;The inches %.3f in centimeters is %.3f
\n&quot;,inch,convertInchesToCentimeters(inch));
}
}