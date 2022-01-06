public class Game {
    Dice dice1 = new Dice();
    Dice dice2 = new Dice();
    Player[] playerList;
    Gui gui = new Gui();
    //Board field = new Board();
    private void runTurn(int turnNum ){
        Player player = playerList[turnNum];
        int die1Facevalue = dice1.roll();
        int die2Facevalue = dice2.roll();
        int dicesum;
        dice1.roll();
        dice2.roll();
        dicesum = die1Facevalue + die2Facevalue;
        player.addpostion(dicesum);


        gui.moveplayer(turnNum,player.position);
        //field.field(player,player.position);


        gui.Dice(die1Facevalue,die2Facevalue);
        gui.changeBalance(turnNum,player.account.getBalance());

        gui.moveplayer(turnNum,player.position);



    }
    public  void game() {

        int amount = gui.hentAntalSpillere();
        playerList = new Player[amount];
        for(int i = 0; i < amount; i++ ) {
            playerList[i] = new Player(gui.player_name);
        }
        gui.opsætSpillere(playerList,amount);

        while(true){

            for(int i = 0; i < amount;i++){
                Player nuvernespiller = playerList[i];
                gui.waitButton(nuvernespiller.name);
                runTurn(i);




            }}}}

