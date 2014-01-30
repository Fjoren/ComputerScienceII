import java.util.Date;

class AccountTest {
    public static void main (String[] args) {
        Account newAccount = new Account(1122,20000);
        newAccount.setAnnualInterestRate(4.5);
        newAccount.withdraw(2500);
        newAccount.deposit(3000);
        System.out.printf("Balance: %.2f" + "\nMonthly Interest: %.2f" + "\nDate Created: " + newAccount.getDateCreated().toString() + "\n", newAccount.getBalance(), newAccount.getMonthlyInterest());
        System.out.println(newAccount);
    }
}
