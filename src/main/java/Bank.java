public class Bank {
    private int balance;

    public void account() {balance = 30000;}

    public boolean addBalance(int money) {
        money = money + balance;
        if ((balance + money) < 0)
            return false;

        balance = balance + money;
        return true;
    }

    public int getBalance() {
        return balance;
    }

    public void addBalance1(int amount){
        balance += amount;

    }
    public int addNewBalance(int newamount){
        balance += newamount;
        return balance;
    }
}

