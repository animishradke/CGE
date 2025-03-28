import java.util.*;
class cf22{

public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.print(&quot;Enter the Salary&quot;);
int salary=input.nextInt();
System.out.print(&quot;Enter the working years&quot;);
int years=input.nextInt();
int bonus=0;
if(years&gt;5) {
bonus=(salary/100)*5;
}
System.out.print(&quot;Bonus salary is &quot;+bonus);
}
}