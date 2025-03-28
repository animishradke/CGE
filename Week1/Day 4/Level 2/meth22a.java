import java.util.Scanner;
class meth22{
  public static int recursivesum(int n ){
  if(n==0){
  return 0;
  }else{
  return n + recursivesum(n-1);
  }
  }
  
  public static int formulasum(int n){
  if(n==0){
  return 0;
  }
  else{
  return (n*(n+1))/2;
  }
  }

public static void main(String[] args){
  Scanner scanner=new Scanner(System.in);
  System.out.println("Enter a postive number:");
  int n=scanner.nextInt();
  
  if(n<=0){
  System.out.println("Invalid number,enter  a postive number");
 
  return; 
  }
  
  int recursiveresult=recursivesum(n);
  int formularesult=formulasum(n);
  
  System.out.println("Sum using recursive method is:"+recursiveresult);
  System.out.println("Sum using formula method is:"+formularesult);
  
  
  if (recursiveresult == formularesult) {
            System.out.println("\nVerification: The results from both computations are correct.");
        } else {
            System.out.println("\nVerification: The results from both computations do NOT match. There might be an error.");
        }
   scanner.close();
 }
  }