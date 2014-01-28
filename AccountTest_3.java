import java.util.Date;

class AccountTest3 {
    public static void main (String[] args) {
        Account newAccount = new CheckingAccount(1234,1000000,.5,1000);
        System.out.println(newAccount);
        newAccount.withdraw(1001000);
        System.out.println(newAccount);
        newAccount.withdraw(1000);
        newAccount.withdraw(1);
        System.out.println(newAccount);
        newAccount = new SavingsAccount(1234,1000000,.5);
        System.out.println(newAccount);
        newAccount.withdraw(1000001);
        System.out.println(newAccount);
        newAccount.withdraw(999999);
        System.out.println(newAccount);
        newAccount.withdraw(2);
    }
}
