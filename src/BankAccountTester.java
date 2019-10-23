/**
 Tests the bank account class with interest.
 */
public class BankAccountTester
{
    public static void main(String[] args)
    {
        BankAccount momsSavings = new BankAccount(10);
        momsSavings.addInterest(10);
        momsSavings.deposit(1000);
        System.out.print("Balance: " + momsSavings.getBalance());
    }
}
