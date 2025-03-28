import java.util.Scanner;
  class meth17{
     public static int sum(int num){
    int total=0;
	for (int i = 1; i <= num; i++) {
            total += i;
        }
        return total;
    
   }
	 public static void main(String[] args){
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("Enter the natural number:");
	 int num=scanner.nextInt();
	 
	 int result=sum(num);
	 System.out.printf("The sum of numbers from 1 to %d is %d", num, result);
	 
	 scanner.close();
   }
  }