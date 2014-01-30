import java.util.Date;

class AccountTest1 {
    public static void main (String[] args) {
        Account newAccount = new Account();
        Date copy = newAccount.getDateCreated();
        System.out.println(newAccount.getDateCreated().getDate());
        copy.setDate(10);
        System.out.println(newAccount.getDateCreated().getDate());		
    }
}
