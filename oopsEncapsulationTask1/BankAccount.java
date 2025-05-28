public class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("iNVALID! the first balance cannot be less than 0.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs." + amount);
        } else {
            System.out.println("Invalid! Deposit must be greater than 0.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: Rs" + amount);
            } else {
                System.out.println("Insufficient amount");
            }
        } else {
            System.out.println("Invalid! amount must be greater than 0.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void printAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: Rs" + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("045567231", "Avay Lama", 500.00);

        System.out.println("first Account Details  :");
        account.printAccountDetails();

        
        account.deposit(150.00);

        account.withdraw(100.00);

        account.withdraw(1000.00);
        
        System.out.println("\nFinal Account Details:");
        account.printAccountDetails();
    }
}
