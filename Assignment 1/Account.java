import java.util.Date;

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    Account () {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    Account (int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }
    
    Account (int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new Date();
    }

    public int getId () {
        return this.id;
    }

    public double getBalance () {
        return this.balance;
    }

    public double getAnnualInterestRate () {
        return this.annualInterestRate;
    }

    public void setId (int id) {
        this.id = id;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate (double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated () {
        return (Date)dateCreated.clone();
    }

    public double getMonthlyInterestRate () {
        return annualInterestRate/12;
    }

    public double getMonthlyInterest () {
        return (getMonthlyInterestRate()/100*balance);
    }

    public double withdraw (double amount) {
        balance -= amount;
        return balance;
    }

    public double deposit (double amount) {
        balance += amount;
        return balance;
    }

    public String toString () {
        String output;
        output = String.format("ID: %d\nBalance: %.2f\nAnnual Interest Rate: %f\nDate Created: " + dateCreated.toString(), id,balance,annualInterestRate);
        return output;
    }

}
