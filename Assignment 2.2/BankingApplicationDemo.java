// Define a custom exception class
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Define the Account class
class Account {
    private int accountNo;
    private double balance;

    // Constructor to initialize account number and balance
    public Account(int accountNo, double initialBalance) {
        this.accountNo = accountNo;
        this.balance = initialBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("Deposited: $" + amt);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amt) throws InsufficientFundsException {
        if (amt > balance) {
            throw new InsufficientFundsException("Insufficient funds. Available balance: $" + balance);
        } else if (amt > 0) {
            balance -= amt;
            System.out.println("Withdrew: $" + amt);
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    // Method to get account number
    public int getAccountNo() {
        return accountNo;
    }
}

// Main class to test the Account and custom exception
public class BankingApplicationDemo {
    public static void main(String[] args) {
        // Create an account with an initial balance
        Account myAccount = new Account(12345, 1000.00);

        // Test deposit and withdraw methods
        try {
            System.out.println("Initial Balance: $" + myAccount.getBalance());

            // Deposit money
            myAccount.deposit(500.00);
            System.out.println("Balance after deposit: $" + myAccount.getBalance());

            // Withdraw money
            myAccount.withdraw(200.00);
            System.out.println("Balance after withdrawal: $" + myAccount.getBalance());

            // Attempt to withdraw more than the balance
            myAccount.withdraw(2000.00);
            
        } catch (InsufficientFundsException e) {
            // Handle the custom exception
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
