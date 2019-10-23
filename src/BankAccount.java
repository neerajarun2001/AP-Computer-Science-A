/**
 A bank account has a balance that can be changed by
 deposits and withdrawals.
 */
public class BankAccount
{
    private double balance;
    private double fee;

    /**
     Constructs a bank account with a zero balance
     */
    public BankAccount(int fee1)
    {
        balance = 0;
        fee = fee1;
    }

    /**
     Constructs a bank account with a given balance
     @param initialBalance the initial balance
     */
    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }

    /**
     Deposits money into the bank account.
     @param amount the amount to deposit
     */
    public void deposit(double amount)
    {
        double newBalance = balance + amount - fee;
        balance = newBalance;
    }

    /**
     Withdraws money from the bank account.
     @param amount the amount to withdraw
     */
    public void withdraw(double amount)
    {
        double newBalance = balance - amount - fee;
        balance = newBalance;
    }

    /**
     Gets the current balance of the bank account.
     @return the current balance
     */
    public double getBalance()
    {
        return balance;
    }

    /**
     . . .
     */
    public void addInterest(double rate)
    {
    }
}
