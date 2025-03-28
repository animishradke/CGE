import java.util.*;
class 312{
public int[] generate4DigitRandomArray(int size){
int[] random=new int[size];
for(int i=0;i&lt;size;i++){
random[i]=(int)(Math.random()*9000)+1000;
}
return random;
}
public double[] findAverageMinMax(int[] numbers) {
double average;
double sum=0;
double min=Double.MAX_VALUE;
double max=Double.MIN_VALUE;
for(int i=0;i&lt;numbers.length;i++){
sum+=numbers[i];
21
if(numbers[i]&gt;max){
max=numbers[i];
}
if(numbers[i]&lt;min){
min=numbers[i];

19

}
}
average=sum/numbers.length;
return new double[]{average,min,max};
}
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println(&quot;Enter how many random numbers
should be generate&quot;);
int size=input.nextInt();
RandomGen res=new RandomGen();
int[] result=res.generate4DigitRandomArray(size);
double[] fina=res.findAverageMinMax(result);
for(int i=0;i&lt;size;i++){
System.out.println(result[i]);
}
}
System.out.println(&quot;Average of 5 random numbers is
&quot;+fina[0]);
System.out.println(&quot;Minimum value of 5 random numbers
is &quot;+fina[1]);
System.out.println(&quot;Maximum value of 5 random numbers
is &quot;+fina[2]);
}