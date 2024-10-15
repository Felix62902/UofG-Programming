public class BankAccount {
    String name;
    int accountNumber;
    double accountBalance;
    static int nextAccountNumber = 0;

    public BankAccount(String name){
        name = name;
        accountNumber = nextAccountNumber;
        accountBalance = 0.0;
        nextAccountNumber+=1 ;
    }

    public int get(){
        return this.accountNumber;
    }

    public void deposit(int amount){
        this.accountBalance+=amount;
    }

    public boolean withdraw(int amount){
        if(accountBalance>=amount){
            accountBalance-=amount;
            return true;
        }
        return false;
    }

}
