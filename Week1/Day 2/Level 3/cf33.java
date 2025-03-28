import java.util.*;
public cf33{
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.print(&quot;Enter the maths marks for 100&quot;);
int maths=input.nextInt();
System.out.print(&quot;Enter the physics marks for 100&quot;);
int physics=input.nextInt();
System.out.print(&quot;Enter the Chemistry marks for 100&quot;); int
chemistry=input.nextInt();
int totalmarks=maths+physics+chemistry; int percentage=totalmarks/3;
if(percentage&lt;=39){
System.out.println(&quot; Total marks = &quot;+totalmarks+ &quot; Grade = R and Remarks :
Remedial standards &quot;);
} else if(percentage&gt;=70 &amp;&amp; percentage&lt;=79){
System.out.println(&quot; Total marks = &quot;+totalmarks+ &quot; Grade = B and Remarks :
Level-3,at agency-normalized standards &quot;);
}
else if(percentage&gt;=60 &amp;&amp; percentage&lt;=69){ System.out.println(&quot; Total marks
= &quot;+totalmarks + &quot; Grade = C and Remarks : Level-2,Below but aproaching
agency-normalized standards &quot;);
}
else if(percentage&gt;=50 &amp;&amp; percentage&lt;=59){
System.out.println(&quot; Total marks = &quot;+totalmarks + &quot; Grade = D and Remarks
: Level-1,Well below agency-normalized standards &quot;);
} else if(percentage&gt;=40 &amp;&amp; percentage&lt;=49){
System.out.println(&quot; Total marks = &quot;+totalmarks + &quot;Grade = E and Remarks :

6

Level-1,too below agency-normalized standards &quot;);
}
else{
System.out.println(&quot; Total marks = &quot;+totalmarks + &quot; Grade = A and Remarks :
Level-4,Above agency-normalized standards &quot;);
}
}
}