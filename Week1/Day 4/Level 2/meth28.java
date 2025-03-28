import java.util.*;
class meth28{
public static int youngest(int[] age){
int young=0;
for(int i=1;i&lt;age.length;i++){
if(age[i]&lt;age[young]){
young=i;
}
}
return young;
}
public static int tallest(int[] height){
int tall=0;
for(int i=1;i&lt;height.length;i++){
if(height[i]&gt;height[tall]){
tall=i;
}
}
return tall;
}
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int[] age=new int[3];
int[] height=new int[3];
String[] name={&quot;Amar&quot;,&quot;Akbar&quot;,&quot;Anthony&quot;};
for(int i=0;i&lt;3;i++){
System.out.println(&quot;Enter the age of friend
&quot;+name[i]);
age[i]=input.nextInt();
System.out.println(&quot;Enter the height of friend
&quot;+name[i]);
height[i]=input.nextInt();
}
int youngestIndex=youngest(age);
String youngestFriend=name[youngestIndex];
System.out.println(&quot;The youngest friend is
&quot;+youngestFriend);
int tallIndex=tallest(height);
String tallestFriend=name[tallIndex];
System.out.println(&quot;The tallest friend is
&quot;+tallestFriend);
}
}