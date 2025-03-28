import java.util.*;
public class meth27{
public boolean canStudentVote(int age) {
if(age&lt;0){
return false;
}
return age&gt;=18;
}
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int[] age=new int[10];
for (int i = 0; i &lt; age.length; i++) {
System.out.println(&quot;Enter the age of student &quot;+(i+1));
age[i]=input.nextInt();
}
StudentVoteChecker n=new StudentVoteChecker();
for (int i = 0; i &lt; age.length; i++) {
boolean result=n.canStudentVote(age[i]);
if(result){
System.out.println((i+1)+&quot; student can vote&quot;);

12

}
else{
System.out.println((i+1)+&quot; student cannot vote&quot;);
}
}
}
}