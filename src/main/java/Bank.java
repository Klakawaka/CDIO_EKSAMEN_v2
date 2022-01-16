public class Bank {
    private int balance;

    public void account() {balance = 30000;}


    public int getBalance() {
        return balance;
    }


    public int addNewBalance(int newamount){
        balance += newamount;
        return balance;
    }
}

