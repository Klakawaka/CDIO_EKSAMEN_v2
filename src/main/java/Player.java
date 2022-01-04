public class Player {
    String name;
    int position;
    Bank account = new Bank();


    public Player(String name) {
        this.name = name;
        account.account();
    }

    //adbalance bruges til case 1,2 og 6//
    //adposition bruges til case 3 og 4
    public void addpostion(int toAddPosition){
        position = (position + toAddPosition)%39;


    }

    public void setPosition(int moveto){
        position = moveto;
    }

}

