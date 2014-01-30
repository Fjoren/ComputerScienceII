class SavingsAccount extends Account {
    
    SavingsAccount () {
        super();
    }

    SavingsAccount (int id, double balance, double annualInterestRate) {
        super(id,balance,annualInterestRate);
    }

    @Override
    public double withdraw (double amount) {
        if (getBalance() >= amount)
            super.withdraw(amount);
        else
            System.out.println("Insufficient funds.");
        return getBalance();
    }

}
