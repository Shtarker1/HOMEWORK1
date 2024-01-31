public class StandardAccount implements IAccount {
    private int accountNumber;
    private double withdrawLimit;
    private double CurrentBalance;
    private double creditLimit;

    public StandardAccount(int accountNumber,double creditLimit) {
        this.accountNumber = accountNumber;
        this.withdrawLimit = withdrawLimit;
        this.creditLimit = creditLimit;
        this.CurrentBalance = 0;
    }

    private void UpdateCurrentBalance(double NewBalance) {
        this.CurrentBalance = NewBalance;
    }

    @Override
    public void Deposit(double amount) {
        if (amount>0) {
            double NewBalance = GetCurrentBalance() + amount;
            UpdateCurrentBalance(NewBalance);
        } else {
            return;
        }
    }

    @Override
    public double Withdraw(double amount) {
        double AvailableBalance = GetCurrentBalance() - creditLimit;

        if (amount >= AvailableBalance) {
            double WithdrawnAmount = AvailableBalance;
            double NewBalance = GetCurrentBalance() - WithdrawnAmount;
            UpdateCurrentBalance(NewBalance);
            return WithdrawnAmount;
        } else {
            double WithdrawnAmount = amount;
            double NewBalance = GetCurrentBalance() - WithdrawnAmount;
            UpdateCurrentBalance(NewBalance);
            return WithdrawnAmount;
        }
    }

    @Override
    public double GetCurrentBalance() {
        return CurrentBalance;
    }

    @Override
    public int GetAccountNumber() {
        return accountNumber;
    }
}