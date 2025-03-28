class cf27{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.print(&quot;ENter the number&quot;);
int number=input.nextInt();
int i=number;
if(number&gt;0){
while(i&gt;0){
if(number%i==0){
System.out.println(i);
}
i--;
}
}
}
}