class CheckingAccount extends Account {
    double overdraftLimit;

    CheckingAccount () {
        overdraftLimit = 0;
    }

    CheckingAccount (int id, double balance, double annualInterestRate, double overdraftLimit) {
        super (id,balance,annualInterestRate);
        this.overdraftLimit = overdraftLimit;
    }
    
    @Override
    public double withdraw (double amount) {
        if (getBalance()+overdraftLimit >= amount)
            super.withdraw(amount);
        else
            System.out.println("Not enough money in account.");
        return getBalance();
    }
    
    public String toString () {
        return String.format(super.toString() + "\nOverdraft Limit: %.2f", overdraftLimit);
    }

}

