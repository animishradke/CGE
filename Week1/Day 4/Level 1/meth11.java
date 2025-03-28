import java.util.Scanner;
class meth11{
public static double calculatesimpleintereset(double principal,double rate,double time){
return (principal*rate*time)/100;
}


     public static void main(String[] args){
     Scanner scanner=new Scanner(System.in);
       System.out.println("Enter the Principal:");
      double principal=scanner.nextDouble();
      System.out.println("Enter the Rate:");
      double rate=scanner.nextDouble();
	  System.out.println("Enter the Time:");
       double  time=scanner.nextDouble();
     double SimpleInterset=calculatesimpleintereset(principal,rate,time);
	 System.out.printf("The Simple Interest is %.2f for pricipal %.2f,rate of Interest %.2f,and Time %.2f years.",SimpleInterset,principal,rate,time);

     scanner.close();
     }
}
