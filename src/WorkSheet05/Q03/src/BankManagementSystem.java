public class BankManagementSystem {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(1000);
        bankAccount.withdraw(100);

        System.out.println("Current Balance is : "+bankAccount.getBalance());
    }

}
