import java.util.ArrayList;
import java.util.List;

public class Bank implements IBank {
    private List<IAccount> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    @Override
    public void OpenAccount(IAccount account) {
        accounts.add(account);
    }

    @Override
    public void CloseAccount(int accountNumber) {
        accounts.removeIf(account -> account.GetAccountNumber() == accountNumber && account.GetCurrentBalance() >= 0);
    }


    @Override
    public List<IAccount> GetAllAccounts() {
        return accounts;
    }

    @Override
    public List<IAccount> GetAllAccountsInDebt() {
        List<IAccount> debtAccounts = new ArrayList<>();
        for (IAccount account : accounts) {
            if (account.GetCurrentBalance() < 0) {
                debtAccounts.add(account);
            }
        }
        return debtAccounts;
    }

    @Override
    public List<IAccount> GetAllAccountsWithBalance(double balanceAbove) {
        List<IAccount> accountsWithBalanceAbove = new ArrayList<>();
        for (IAccount account : accounts) {
            if (account.GetCurrentBalance() > balanceAbove) {
                accountsWithBalanceAbove.add(account);
            }
        }
        return accountsWithBalanceAbove;
    }
}
