package day18_GarbageCollection;

public class BankAccount {

    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=$" + balance +
                '}';
    }

    //check balance method
    public void checkBalance(){
        System.out.println("Your available balance is $"+balance);
    }

    //deposit method
    public void deposit(double amount){

        if (amount < 1){
            System.out.println("Insufficient amount "+amount);
            return;
        }

        System.out.println("Depositing $"+amount+" to "+accountHolder);
        balance += amount;
    }

    //withdraw method
    public void withdraw(double amount){

        if (amount>balance){
            System.out.println("Insufficient account balance amount to withdraw "+amount);
        }

        System.out.println("Withdrawing $"+amount+" from "+accountHolder);
        balance -= amount;
    }

}
