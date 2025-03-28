  import java.util.Scanner;
  class meth22{
     public static double maxstudents(double num){
     return (num*(num-1))/2;
     }
     public static void main(String[] args){
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("Enter the number of students:");
	 double num=scanner.nextDouble();
	 double handshakes=maxstudents(num);
	 System.out.printf("Enter the maximum number of handshakes are %.2f\n",handshakes);
     scanner.close();
   }
  }