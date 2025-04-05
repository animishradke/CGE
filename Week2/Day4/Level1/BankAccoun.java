class BankAccount {
static String bankName = &quot;Global Bank&quot;

private static int totalAccounts = 0;
private final int accountNumber;
private String accountHolderName;
private double balance;
public BankAccount(int accountNumber, String accountHolderName, double
balance) {
this.accountNumber = accountNumber;
this.accountHolderName = accountHolderName;
this.balance = balance;
totalAccounts++;
}
public static void getTotalAccounts() {
System.out.println(&quot;Total accounts created: &quot; + totalAccounts);
}