import gui_fields.GUI_Player;
import gui_main.GUI;

public class Gui {
    String player_name;
    GUI_Player[] playerList; //create and initilize player //create and initilize player
    GUI gui; //create gui variable
    int[] playerlistPosition;

    public Gui(){
        gui = new GUI();
    }

    public int hentAntalSpillere() {
        String chosenButton2 = gui.getUserButtonPressed("How many players are playing?", "2", "3", "4"); //create and initilize chosenButton
        return Integer.parseInt(chosenButton2);
    }

    public void opsætSpillere(Player[] list, int x) {
        playerList = new GUI_Player[list.length];
        playerlistPosition = new int[list.length];
        for (int i = 0; i < x; i++) {
            player_name = gui.getUserString("Enter player name");
            list[i].name = player_name;
            playerList[i] = new GUI_Player(player_name, list[i].account.getBalance());
            gui.addPlayer(playerList[i]);
            gui.getFields()[0].drawCar(playerList[i], true);
        }
    }


    public void moveplayer(int playerTurn, int newPosition){
        gui.getFields()[playerlistPosition[playerTurn]].drawCar(playerList[playerTurn], false); //hide the players car
        gui.getFields()[newPosition].drawCar(playerList[playerTurn], true); //show the car in the new position
        playerlistPosition[playerTurn] = newPosition;
    }
    public void waitButton(String currentPlayerName){
        String chosenButton = gui.getUserButtonPressed(currentPlayerName+" Click to play", "Play"); //create and initilize chosenButton

    }
    public boolean buyButton(){
        //String buyButton = gui.getUserButtonPressed(currentPlayerName+" Click to the card","Buy Card");
        boolean Buy  = gui.getUserLeftButtonPressed(
                "Do you want to buy the card?",
                "Buy", "No"
        );
        return Buy;
        //---- gui.buyButton = occupied?
    }
    public void changeBalance(int playerNum, int newBalance){
        playerList[playerNum].setBalance(newBalance);

    }

    public void Dice(int dice1,int dice2){
        gui.setDice(dice1,dice2);
    }

    public String chanceCardView(String text){
        gui.displayChanceCard(text);
        return text;
    }

    public boolean chooseLanguage(){
        boolean choose = gui.getUserLeftButtonPressed("Choose language", "English", "Dansk");
        return choose;
    }

}


