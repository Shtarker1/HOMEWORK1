public class PremiumAccount implements IAccount {
    private int accountNumber;
    private double CurrentBalance;

    public PremiumAccount(int accountNumber) {
        this.accountNumber = accountNumber;
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
        double NewBalance = CurrentBalance - amount;
        UpdateCurrentBalance(NewBalance);
        return amount;
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
