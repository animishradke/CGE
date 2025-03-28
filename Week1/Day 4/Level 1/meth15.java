import java.util.Scanner;
  class meth15{
     public static String integer(int num){
     if(num>0){
	 return num+"is positve";
	 }else if(num<0){
	 return num +"is negitive";
	 }
	 else{
	 return "The number is zero";
	 }
	 }
     
     public static void main(String[] args){
	 int num=7;
	 System.out.println(integer(num));
     
   }
  }