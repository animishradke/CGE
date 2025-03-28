import java.util.Scanner;
class meth12{
public static double maxstudents(double num){
return (num*(num-1))/2;
}
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.println(&quot;Enter the number of students:&quot;);
double num=scanner.nextDouble();
double handshakes=maxstudents(num);
System.out.printf(&quot;Enter the maximum number of handshakes are
%.2f\n&quot;,handshakes);
scanner.close();
}
}