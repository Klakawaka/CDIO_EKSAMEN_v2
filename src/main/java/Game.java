

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Math;



public class Game {
    Dice dice1 = new Dice();
    Dice dice2 = new Dice();
    Player[] playerList;
    Player player;
    Gui gui = new Gui();
    Field field = new Field();
    String file;
    String[] read = new String[95];


    ChanceCard chanceCard = new ChanceCard();
    private void runTurn(int turnNum ){
        player = playerList[turnNum];
        int die1Facevalue = dice1.roll();
        int die2Facevalue = dice2.roll();
        int dicesum;
        dice1.roll();
        dice2.roll();
        dicesum = die1Facevalue + die2Facevalue;
        player.addpostion(dicesum);
        final int MAX = 38 ;
        int card = (int) (Math.random() * MAX) + 1;






        gui.moveplayer(turnNum,player.position);




        gui.Dice(die1Facevalue,die2Facevalue);
        field.fields(player,player.position, gui.buyButton(read[4],read[5],read[6]));
        if (player.position == 2 || player.position == 7 || player.position == 17 || // ChanceKort placeringer
                player.position == 22 || player.position == 33 || player.position == 36){
            chanceCard.getChancecard(player,playerList,card);
            gui.chanceCardView(read[chanceCard.chanceCardText(card)]);// Viser hvilket ChanceKort man har trukket
        }
        if (player.position == 30){
            player.position = 10;
            if (die1Facevalue != die2Facevalue){
                player.position = 10;
            }
        }


        gui.changeBalance(turnNum,player.account.getBalance());

        gui.moveplayer(turnNum,player.position);




    }
    public  void game() {
        if (gui.chooseLanguage()){
            file = "src/main/Engelsk oversættelse .txt"; //henter engelske tekster

        }else{
            file = "src/main/Dansk oversættelse .txt"; // henter Danske tekster
        }
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for(int i=0; i<read.length; i++){
            try {
                assert reader != null; // hele den her try/catch gør at vores kan læse de 2 filer som giver text til vores spil
                read[i] = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Gui.read = read;
        gui = new Gui();



        int amount = gui.hentAntalSpillere(read[0]);
        playerList = new Player[amount];
        for(int i = 0; i < amount; i++ ) {
            playerList[i] = new Player(gui.player_name);
        }
        gui.opsætSpillere(playerList,amount,read[1]);

        while(true){

            for(int i = 0; i < amount;i++){
                Player nuvernespiller = playerList[i];
                gui.waitButton(nuvernespiller.name,read[2],read[3]);
                runTurn(i);
                if (player.account.getBalance() <= 0){ // hvis spileren rammer bunden (har 0kr tilbage)
                    if(gui.exitGame(read[88],read[89],read[90])){
                        gui.endGame();
                    }


                }





            }}}}

