import java.util.Scanner;
class str11{
  public static boolean compare(String text1,String text2){
    if(text1.length()!=text2.length()){
	return false;
	}
	for(int i=0;i<text1.length();i++){
	if(text1.charAt(i)!=text2.charAt(i)){
	return false;
	}
	}
	return true;
	
}



   public static void main(String[] args){
     Scanner scanner=new Scanner(System.in);
	 System.out.println("Enter a text1:");
	 String text1=scanner.next();
	 
	 System.out.println("Enter a text2:");
	 String text2=scanner.next();
	 
	boolean equal=compare(text1,text2);
	boolean builtin=text1.equals(text2);
	
	System.out.println("using compare:"+equal);
	System.out.println("using built in:"+builtin);
	
	if(equal==builtin){
	System.out.println("They are equal");			
	}
	else{
		System.out.println("They are not equal");
		
	}
	
	
	scanner.close(); 
  

  }
  }