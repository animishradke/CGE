import java.util.Scanner;
  class meth14{
     public static double rounds(double distance,int perimeter){
     return (distance/perimeter);
     }
     public static void main(String[] args){
	 Scanner scanner=new Scanner(System.in);
	 
	 System.out.println("Enter the one side of a triangle:");
	 int  side1=scanner.nextInt();
	 
	 System.out.println("Enter the second side of a triangle:");
	 int  side2=scanner.nextInt();
	 
	 System.out.println("Enter the third side of a triangle:");
	 int  side3=scanner.nextInt();
	 System.out.println("Enter the distance in m:");
	 int distance=scanner.nextInt();
	 int perimeter=side1+side2+side3;
	 double totalrounds=rounds(distance,perimeter);
	 System.out.printf("The total rounds covered by an athelete is %2f",totalrounds);
	 
	 
	 scanner.close();
   }
  }