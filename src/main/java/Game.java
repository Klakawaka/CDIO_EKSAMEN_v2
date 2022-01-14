import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class Game {
    Dice dice1 = new Dice();
    Dice dice2 = new Dice();
    Player[] playerList;
    Gui gui = new Gui();
    Field field = new Field();
    String file;
    String[] read = new String[81];
    int x;
    ChanceCard chanceCard = new ChanceCard();
    private void runTurn(int turnNum ){
        Player player = playerList[turnNum];
        int die1Facevalue = dice1.roll();
        int die2Facevalue = dice2.roll();
        int dicesum;
        dice1.roll();
        dice2.roll();
        dicesum = die1Facevalue + die2Facevalue;
        player.addpostion(dicesum);



        // public class Game {
        // Board board = new Board();
        // Player player1 = new Player(name: "string");
        //
        // void runTurn() {
        // Field currentField = board.fields();
        // if (currentField instanceof Field) {
        //      if (((Field) currentField). owner = null) {
        //
        // }}}
        // ...


        gui.moveplayer(turnNum,player.position);

       //if (gui.buyButton()==false) {
         //   field.fields(player, player.position, false);
        //} else if (gui.buyButton()==true) {
            //field.fields(player, player.position, true);
        //}


        gui.Dice(die1Facevalue,die2Facevalue);
        field.fields(player,player.position, gui.buyButton(read[4],read[5],read[6]));//, playerList,x);
        if (player.position == 2 || player.position == 7 || player.position == 17 ||
                player.position == 22 || player.position == 33 || player.position == 36){
            chanceCard.getChancecard(player,playerList);
            gui.chanceCardView(read[chanceCard.chanceCardText()]);
        }


        gui.changeBalance(turnNum,player.account.getBalance());

        gui.moveplayer(turnNum,player.position);



    }
    public  void game() {
        if (gui.chooseLanguage()){
            file = "src/main/Engelsk oversættelse .txt";

        }else{
            file = "src/main/Dansk oversættelse .txt";
        }
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for(int i=0; i<read.length; i++){
            try {
                assert reader != null;
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




            }}}}

