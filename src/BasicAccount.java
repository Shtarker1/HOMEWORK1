public class BasicAccount implements IAccount {
    private int accountNumber;
    private double CurrentBalance;
    private double creditLimit;

    public BasicAccount(int accountNumber, double creditLimit) {
        this.accountNumber = accountNumber;
        this.creditLimit = creditLimit;
        this.CurrentBalance = 0;
    }

    private void UpdateCurrentBalance(double newBalance) {
        this.CurrentBalance = newBalance;
    }


    @Override
    public void Deposit(double amount) {
        if (amount > 0) {
            double newBalance = GetCurrentBalance() + amount;
            UpdateCurrentBalance(newBalance);
        }
    }

    @Override
    public double Withdraw(double amount) {
        double AvailableBalance = creditLimit;

        if (amount >= AvailableBalance && CurrentBalance > AvailableBalance) {
            double NewBalance = GetCurrentBalance() - AvailableBalance;
            UpdateCurrentBalance(NewBalance);
            return AvailableBalance;
        } else if (amount >= AvailableBalance && CurrentBalance < AvailableBalance){
            double NewBalance = GetCurrentBalance() - AvailableBalance;
            UpdateCurrentBalance(NewBalance);
            return CurrentBalance;
        } else if (amount <= AvailableBalance && CurrentBalance > amount) {
            double NewBalance = GetCurrentBalance() - AvailableBalance;
            UpdateCurrentBalance(NewBalance);
            return amount;
        } double NewBalance = CurrentBalance - amount;
        UpdateCurrentBalance(NewBalance);
        return CurrentBalance;
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

