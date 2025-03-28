import java.util.Scanner;
class str12{
public static String  substring(String str,int start,int end){
    String result="";
	for(int i=start;i<end;i++){
	result+=str.charAt(i);
	}
   return result;
}

public static boolean compare(String str1,String str2){
  if(str1.length()!=str2.length()){
  return false;
  }
  for(int i=0;i<str1.length();i++){
  if(str1.charAt(i)!=str2.charAt(i)){
  return false;
  }  
  }
   return true;
}

 public static void main(String[] args){
 Scanner scanner=new Scanner(System.in);
 System.out.println("Enter the String 1:");
 String str=scanner.next();
 
  System.out.println("Enter the Starting index :");
 int start=scanner.nextInt();
 
 System.out.println("Enter the ending index :");
 int end=scanner.nextInt();
 
 String sub=substring(str,start,end);
 System.out.println("The sub is:"+ sub);
 
 String builtin=str.substring(start,end);
 System.out.println("Substring using substring(): " + builtin);
 
   boolean areEqual = compare(sub, builtin);
    System.out.println("Are the two substrings equal? " + areEqual);
 
 
 
 scanner.close();
 
 }
 }