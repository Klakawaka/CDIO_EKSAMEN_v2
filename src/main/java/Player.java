public class Player {
    String name;
    int position;
    Bank account = new Bank();


    public Player(String name) {
        this.name = name;
        account.account();
    }


    public void addpostion(int toAddPosition){
        position = (position + toAddPosition)%39;


    }

    public void setPosition(int moveto){
        position = moveto;
    }

}

