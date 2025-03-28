import java.util.Scanner;
class stringhandlin110{
public static String remove(String str,char ch){
if(str==null){
return null;
}
return str.replace(Character.toString(ch),&quot;&quot;);
}
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.println(&quot;Ente a string&quot;);
String str=scanner.nextLine();
System.out.println(&quot; Enter the character to remove:&quot;);
char ch=scanner.nextLine();

String update=remove(str,ch);
System.out.println(&quot;Updated:&quot;+updated String);
}