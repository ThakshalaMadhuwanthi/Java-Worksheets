public class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    public void deposit(int amount){
        balance = balance+amount;
        System.out.println("Deposited : "+amount);
    }

    public void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("The account balance is not enough for withdrawal \n");

        } else if (amount> 0) {
           balance=balance-amount;
            System.out.println("Withdraw amount is : "+amount);
        }
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


}
