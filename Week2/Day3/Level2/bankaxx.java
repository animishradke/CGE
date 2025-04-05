class BankAccount {
public int accountNumber;
protected String accountHolder;
private double balance;
public BankAccount(int accountNumber, String accountHolder, double

balance) {
this.accountNumber = accountNumber;
this.accountHolder = accountHolder;
this.balance = balance;
}
public void deposit(double amount) {
if (amount &gt; 0) {
balance += amount;
} else {
System.out.println(&quot;Deposit amount must be positive.&quot;);
}
}
public void withdraw(double amount) {
if (amount &gt; 0 &amp;&amp; amount &lt;= balance) {
balance -= amount;
} else {
System.out.println(&quot;Insufficient balance or invalid amount.&quot;);
}
}
public double getBalance() {
return balance;
}
public void displayAccountInfo() {
System.out.println(&quot;Account Number: &quot; + accountNumber);
System.out.println(&quot;Account Holder: &quot; + accountHolder);
System.out.println(&quot;Balance: &quot; + balance);
}
}
class SavingsAccount extends BankAccount {
public SavingsAccount(int accountNumber, String accountHolder, double
balance) {
super(accountNumber, accountHolder, balance);
}
public void displaySavingsInfo() {

System.out.println(&quot;Savings Account Number: &quot; + accountNumber);
System.out.println(&quot;Account Holder: &quot; + accountHolder);
}
}
public class BankAccountManagement {
public static void main(String[] args) {
BankAccount acc = new BankAccount(12345, &quot;John Doe&quot;, 1000);
acc.displayAccountInfo();
System.out.println(&quot;\nDepositing 500...&quot;);
acc.deposit(500);
acc.displayAccountInfo();
System.out.println(&quot;\nWithdrawing 300...&quot;);
acc.withdraw(300);
acc.displayAccountInfo();
System.out.println(&quot;\nSavings Account Details:&quot;);
SavingsAccount savings = new SavingsAccount(67890, &quot;Jane Smith&quot;,
5000);
savings.displaySavingsInfo();
}
}