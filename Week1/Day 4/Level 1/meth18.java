import java.util.Scanner;
  class meth18{
        public static int[] findSmallestAndLargest(int number1, int number2, int number3){
		int smallest=Math.min(number1,Math.min(number2,number3));
		int largest=Math.max(number1,Math.max(number2,number3));
		
		return new int[]{smallest,largest};
		}
		public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
	 System.out.println("Enter the fisrt number:");
	 int number1=scanner.nextInt();
	 
	  System.out.println("Enter the second number:");
	 int number2=scanner.nextInt();
	 
	 System.out.println("Enter the third number:");
	 int number3=scanner.nextInt();
	 
	int[] result = findSmallestAndLargest(number1, number2, number3);

	 
	 
	 int smallest=result[0];
	 int largest=result[1];
	 
	  System.out.printf("The smallest number is  %d and largest is %d",smallest,largest);

		scanner.close();
		}
		}