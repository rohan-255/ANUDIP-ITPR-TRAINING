public class BankAccount {
    String accHolderName;
    int accNumber;
    int balance;
    public BankAccount(String accHolderName, int accNumber, int balance) {
        this.accHolderName = accHolderName;
        this.accNumber = accNumber;
        this.balance = balance;
    }
    public String getAccHolderName() {
        return accHolderName;
    }
    public int getAccNumber() {
        return accNumber;
    }
    public int getBalance() {
        return balance;
    }
    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }
    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            return balance;
        } else {
            System.out.println("Deposit amount must be positive.");
            return balance;
        }
    }
    public int withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return balance;
        } else {
            System.out.println("Insufficient or invalid funds.");
            return balance;
        }
    }
    public void display(){
        System.out.println("Account Holder: " + accHolderName);
        System.out.println("Account Number: " + accNumber);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", 123456, 1000);
        account.display();
        account.deposit(500);
        account.withdraw(200);
        account.display();
        account.withdraw(1500); 
        account.deposit(-100); 
        account.display();
    }
}
