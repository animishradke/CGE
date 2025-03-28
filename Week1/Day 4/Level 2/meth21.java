import java.util.Scanner;
class meth21{
     public static int[] getfactors(int num){
	 int count=0;
	 for(int i=1;i<=num;i++){
	 if(num%i==0){
	  count++;
	 }
	}
	
	int[] factors=new int[count];
	int index=0;
	for(int i=1;i<=num;i++){
	if(num%i==0){
	factors[index++]=i;
	}
	}
	return factors;
	}
	 public static int sumfactors(int[] factors){
	 int sum=0;
	  for(int factor:factors){
	  sum+=factor;
	  }
	 return sum;
	 }
	 
	 public static long productfactors(int[] factors){
	 long prod=1;
	 for(int factor:factors)
	 prod*=factor;
	 }
	 return prod;
	 }
	 
	  public static int[] squarefactors(int[] factors){
	 int sum=0;
	 for(int factor:factors)
	 sum+=Math.pow(factor,2);
	 }
	 return sum;
	 }
	 }
	
	 public static void main(String[] args){
	 Scanner scanner=new Scanner(System.in);
	  System.out.println("Enter a number:");
	  int number=scanner.nextInt();
	  
	  
	  int[] factors=getfactors(number);
	  
	  System.out.println("Factors");
	  
	  System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        System.out.println("Sum of factors: " + sumfactors(factors));
        System.out.println("Product of factors: " + productfactors(factors));
        System.out.println("Sum of squares of factors: " + squaresfactors(factors));
    }
}
