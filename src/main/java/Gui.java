import gui_fields.*;
import gui_main.GUI;

import java.awt.*;
import java.io.BufferedReader;

public class Gui {

    String player_name;
    GUI_Player[] playerList; //create and initilize player //create and initilize player
    GUI gui; //create gui variable
    int[] playerlistPosition;
    public static String[] read = new String[84];


    public Gui(){
     GUI_Field[] fields = {
        new GUI_Start("Start",read[82]+"","få 4000 kr", Color.red,Color.black),
             new GUI_Street("Rødovrevej","Pris 1200 Kr","","1200",Color.blue,Color.black),
             new GUI_Chance("?","Prøv lykken","",Color.gray,Color.black),
             new GUI_Street("Hvidovrevej","Pris 1200 Kr","","1200",Color.blue,Color.black),
             new GUI_Tax("Skat","4000 Kr","betale skat",Color.darkGray,Color.white),
             new GUI_Shipping("default","Øresund","Pris 4000 Kr","","4000",Color.white,Color.black),
             new GUI_Street("Rødovrevej","Pris 2000 Kr","","2000",Color.pink,Color.black),
             new GUI_Chance("?","prøv lykken","",Color.gray,Color.black),
             new GUI_Street("Valbylandgade","Pris 2000 Kr","","2000",Color.pink,Color.black),
             new GUI_Street("Allegade","Pris 2400 Kr","","2400",Color.pink,Color.black),
             new GUI_Jail("default","Fængsel","besøg","",Color.gray,Color.black),
             new GUI_Street("FrederiksbergAlle","Pris 2800 Kr","","2800",Color.green,Color.black),
             new GUI_Brewery("default","Tuborg","Pris 3000 Kr","","3000",Color.black,Color.white),
             new GUI_Street("Bülowsvej","Pris 2800 Kr","","2800",Color.green,Color.black),
             new GUI_Street("GammelKongevej","Pris 3200 Kr","","3200",Color.green,Color.black),
             new GUI_Shipping("default","D.F.D.S","4000 Kr","","4000",Color.white,Color.black),
             new GUI_Street("Bernstofssvej","Pris 3600 Kr","","3600",Color.lightGray,Color.black),
             new GUI_Chance("?","Prøv lykken","",Color.gray,Color.black),
             new GUI_Street("Hellerupsvej","Pris 3600 Kr","","3600",Color.lightGray,Color.black),
             new GUI_Street("Strandvejen","Pris 4000 Kr","","4000",Color.lightGray,Color.black),
             new GUI_Refuge("default","Parkering","Gratis penge","",Color.white,Color.black),
             new GUI_Street("Trianglen","Pris 4400 Kr","","4400",Color.red,Color.black),
             new GUI_Chance("?","Prøv lykken","",Color.gray,Color.black),
             new GUI_Street("Østerbrogade","Pris 4400 Kr","","4400",Color.red,Color.black),
             new GUI_Street("Grøningen","Pris 4800 Kr","","4800",Color.red,Color.black),
             new GUI_Shipping("default","Ø.S","4000 Kr","","4000",Color.white,Color.black),
             new GUI_Street("Bredgade","Pris 5200 Kr","","5200",Color.white,Color.black),
             new GUI_Street("KongensNytorv","Pris 5200 Kr","","5200",Color.white,Color.black),
             new GUI_Brewery("default","Carlsberg","Pris 3000 Kr","","3000",Color.black,Color.white),
             new GUI_Street("Østergade","Pris 5600 Kr","","5600",Color.white,Color.black),
             new GUI_Jail("default","GÅ I FÆNGSEL","GÅ I FÆNGSEL","",Color.gray,Color.black),
             new GUI_Street("Amagertorv","Pris 6000 Kr","","6000",Color.yellow,Color.black),
             new GUI_Street("Vimmelskaftet","Pris 6000 Kr","","6000",Color.yellow,Color.black),
             new GUI_Chance("?","Prøv lykken","",Color.gray,Color.black),
             new GUI_Street("Nygade","Pris 6400 Kr","","6400",Color.yellow,Color.black),
             new GUI_Shipping("default","Bornholm","4000 Kr","","4000",Color.white,Color.black),
             new GUI_Chance("?","Prøv lykken","",Color.gray,Color.black),
             new GUI_Street("Frederiksberggade","Pris 7000 Kr","","7000",Color.yellow,Color.black),
             new GUI_Tax("Skat","2000 Kr","betale skat",Color.darkGray,Color.white),
             new GUI_Street("Rådhuspladsen","Pris 8000 Kr","","8000",Color.yellow,Color.black),















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
        //---- gui.buyButton = occupied?
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

}


