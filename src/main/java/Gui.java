import gui_fields.*;
import gui_main.GUI;

import java.awt.*;


public class Gui {

    String player_name;
    GUI_Player[] playerList; //create and initilize player //create and initilize player
    GUI gui; //create gui variable
    int[] playerlistPosition;
    public static String[] read = new String[92];


    public  Gui(){
     GUI_Field[] fields = {
        new GUI_Start("Start",read[82]+" 4000 Kr","få 4000 kr", Color.red,Color.black),
             new GUI_Street("Rødovrevej",read[82]+" 1200 Kr","","1200",Color.blue,Color.white),
             new GUI_Chance("?",read[83]+"",read[83]+"",Color.gray,Color.black),
             new GUI_Street("Hvidovrevej",read[82]+" 1200 Kr","","1200",Color.blue,Color.white),
             new GUI_Tax(read[84]+"","4000 Kr","betale skat",Color.darkGray,Color.white),
             new GUI_Shipping("default","Øresund",read[82]+" 4000 Kr","","4000",Color.white,Color.black),
             new GUI_Street("Rødovrevej",read[82]+" 2000 Kr","","2000",Color.pink,Color.black),
             new GUI_Chance("?",read[83]+"",read[83]+"",Color.gray,Color.black),
             new GUI_Street("Valbylandgade",read[82]+" 2000 Kr","","2000",Color.pink,Color.black),
             new GUI_Street("Allegade",read[82]+" 2400 Kr","","2400",Color.pink,Color.black),
             new GUI_Jail("default",read[85]+"",read[85]+"",read[85]+"",Color.gray,Color.black),
             new GUI_Street("FrederiksbergAlle",read[82]+" 2800 Kr","","2800",Color.green,Color.black),
             new GUI_Brewery("default","Tuborg",read[82]+" 3000 Kr","","3000",Color.black,Color.white),
             new GUI_Street("Bülowsvej",read[82]+" 2800 Kr","","2800",Color.green,Color.black),
             new GUI_Street("GammelKongevej",read[82]+" 3200 Kr","","3200",Color.green,Color.black),
             new GUI_Shipping("default","D.F.D.S",read[82]+" 4000 Kr","","4000",Color.white,Color.black),
             new GUI_Street("Bernstofssvej",read[82]+" 3600 Kr","","3600",Color.lightGray,Color.black),
             new GUI_Chance("?",read[83]+"",read[83]+"",Color.gray,Color.black),
             new GUI_Street("Hellerupsvej",read[82]+" 3600 Kr","","3600",Color.lightGray,Color.black),
             new GUI_Street("Strandvejen",read[82]+" 4000 Kr","","4000",Color.lightGray,Color.black),
             new GUI_Refuge("default",read[87]+"",read[87]+"","",Color.white,Color.black),
             new GUI_Street("Trianglen",read[82]+" 4400 Kr","","4400",Color.red,Color.black),
             new GUI_Chance("?",read[83]+"",read[83]+"",Color.gray,Color.black),
             new GUI_Street("Østerbrogade",read[82]+" 4400 Kr","","4400",Color.red,Color.black),
             new GUI_Street("Grøningen",read[82]+" 4800 Kr","","4800",Color.red,Color.black),
             new GUI_Shipping("default","Ø.S",read[82]+" 4000 Kr","","4000",Color.white,Color.black),
             new GUI_Street("Bredgade",read[82]+" 5200 Kr","","5200",Color.white,Color.black),
             new GUI_Street("KongensNytorv",read[82]+" 5200 Kr","","5200",Color.white,Color.black),
             new GUI_Brewery("default","Carlsberg",read[82]+" 3000 Kr","","3000",Color.black,Color.white),
             new GUI_Street("Østergade",read[82]+" 5600 Kr","","5600",Color.white,Color.black),
             new GUI_Jail("default",read[86]+"",read[86]+"",read[86]+"",Color.gray,Color.black),
             new GUI_Street("Amagertorv",read[82]+" 6000 Kr","","6000",Color.yellow,Color.black),
             new GUI_Street("Vimmelskaftet",read[82]+" 6000 Kr","","6000",Color.yellow,Color.black),
             new GUI_Chance("?",read[83]+"",read[83]+"",Color.gray,Color.black),
             new GUI_Street("Nygade",read[82]+" 6400 Kr","","6400",Color.yellow,Color.black),
             new GUI_Shipping("default","Bornholm",read[82]+" 4000 Kr","","4000",Color.white,Color.black),
             new GUI_Chance("?",read[83]+"",read[83]+"",Color.gray,Color.black),
             new GUI_Street("Frederiksberggade",read[82]+" 7000 Kr","","7000",Color.yellow,Color.black),
             new GUI_Tax(read[84]+"","2000 Kr","",Color.darkGray,Color.white),
             new GUI_Street("Rådhuspladsen",read[82]+" 8000 Kr","","8000",Color.yellow,Color.black),

        };
        gui = new GUI(fields,Color.cyan);
    }

    public int hentAntalSpillere(String text) {
        String chosenButton2 = gui.getUserButtonPressed(text, "2", "3", "4"); //create and initilize chosenButton
        return Integer.parseInt(chosenButton2);
    }

    public void opsætSpillere(Player[] list, int x,String text) {
        playerList = new GUI_Player[list.length];
        playerlistPosition = new int[list.length];
        for (int i = 0; i < x; i++) {
            player_name = gui.getUserString(text);
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
    public void waitButton(String currentPlayerName,String text,String button){
        String chosenButton = gui.getUserButtonPressed(currentPlayerName+text,button); //create and initilize chosenButton

    }
    public boolean buyButton(String text, String textYes,String textNO){
        boolean Buy  = gui.getUserLeftButtonPressed(
                text,
                textYes, textNO
        );
        return Buy;

    }
    public void changeBalance(int playerNum, int newBalance){
        playerList[playerNum].setBalance(newBalance);

    }

    public void Dice(int dice1,int dice2){
        gui.setDice(dice1,dice2);
    }

    public void chanceCardView(String text){
        gui.displayChanceCard(text);

    }

    public boolean chooseLanguage(){
        boolean choose = gui.getUserLeftButtonPressed("Choose language", "English", "Dansk");
        return choose;
    }


    public void endGame(){

        gui.close();
    }
    public boolean exitGame(String text, String textYes,String textNO){
        boolean exit  = gui.getUserLeftButtonPressed(
                text,
                textYes, textNO
        );
        return exit;

    }
}


