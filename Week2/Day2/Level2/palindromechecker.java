class PalindromeChecker{
      private String text;
  public PalindromeChecker(String text){
  this.text=text;  
  }
  public boolean isPalindrome(){
  String str = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
  int left=0;
  int right=str.length()-1;
  
  while(left<right){
  if(str.charAt(left)!=str.charAt(right)){
  return false;
  }
  left++;
  right--;
  }
  return true;
  }
  public void display(){
  if(isPalindrome()){
  System.out.println("result:Its not a palindrome!");
  }else {
      System.out.println("Result: Not a palindrome.");
      }
      System.out.println("--------------------------------");
    }

    public static void main(String[] args){
	PalindromeChecker checker1=new PalindromeChecker("sir");
	PalindromeChecker checker2=new PalindromeChecker("how");
	PalindromeChecker checker3=new PalindromeChecker("you");
	checker1.display();
	checker2.display();
	checker3.display();
	
	
	}




}