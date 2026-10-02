public class BankAccount {
  public static void main(String[] args) {
    Account a1 = new Account(1122, 20000, 4.5);

    a1.withdraw(2500);
    a1.deposit(3000);

    System.out.println("Balance is $" + a1.getBal());
    System.out.println("Monthly interest is " + a1.getMonthlyInterest());
    System.out.println("This account was created on " + a1.getDateCreated());
  }
}
