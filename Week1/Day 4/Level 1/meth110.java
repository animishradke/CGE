public static int[] findRemainderAndQuotient(int number, int divisor)
import java.util.Scanner;
class meth110{
public static int[] findRemainderAndQuotient(int number, int divisor){
int quotient=number/divisor;
int remainder=number%divisor;
return new int[]{quotient,remainder};
}
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.println(&quot;Enter the number:&quot;);
int num=scanner.nextInt();
System.out.println(&quot;Enter the divisor:&quot;);
int div=scanner.nextInt();
int[] result=findRemainderAndQuotient(num,div);
System.out.println(&quot;The Quotient is &quot;+result[0]);
System.out.println(&quot;The remainder is &quot;+result[1]);
scanner.close();
}
}