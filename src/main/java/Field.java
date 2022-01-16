public class Field {

    /* Start,Rødovrevej,Hvidovrevej,betalSkat1,Øresund,Roskildevej,
            Valbylandgade,Allegade,
            FrederiksbergAlle,Tuborg,Bülowsvej,GammelKongevej,
            DFDS,Bernstofssvej,Hellerupsvej,
            Strandvejen,Helle,Trianglen,Østerbrogade,
            Grøningen,ØS,Bredgade,KongensNytorv,Carlsberg,Østergade,
            Amagertorv,Vimmelskaftet,Nygade,Bornholm,
            Frederiksberggade,betalSkat2,Rådhuspladsen;

     */


    public void fields(Player player,int playerpos,boolean x){//, Player[] playerList,int text){
        switch (playerpos){
            case 0:
               //Start = 4000;
               player.account.addNewBalance(+4000);
               break;
            case 1:
                //Rødovrevej = 1200;
                if (x) {
                    player.account.addNewBalance(-1200);
                }
                break;
            //case 2:
                //chanceCard.getChancecard(player, playerList,text);
                //break;
            case 3:
              //Hvidovrevej = 1200;
                if (x) {
                    player.account.addNewBalance(-1200);
                }
              break;
            case 4:
                //betalSkat1 = 4000;
                player.account.addNewBalance(-4000);
                break;
            case 5:
                //Øresund = 4000;
                if (x) {
                    player.account.addNewBalance(-4000);
                }
                break;
            case 6:
                //Roskildevej = 2000;
                if (x) {
                    player.account.addNewBalance(-2000);
                }
                break;
            //case 7:
                //chanceCard.getChancecard(player, playerList,text);
                //break;
            case 8:
                //Valbylandgade = 2000;
                if (x) {
                    player.account.addNewBalance(-2000);
                }
                break;
            case 9:
                //Allegade = 2400;
                if (x) {
                    player.account.addNewBalance(-2400);
                }
                break;
            //case 10:
                //Fængsel
                //break;
            case 11:
                //FrederiksbergAlle =2800;
                if (x) {
                    player.account.addNewBalance(-2800);
                }
                break;
            case 12:
                //Tuborg = 3000;
                if (x) {
                    player.account.addNewBalance(-3000);
                }
                break;
            case 13:
                //Bülowsvej =2800;
                if (x) {
                    player.account.addNewBalance(-2800);
                }
                break;
            case 14:
                //GammelKongevej = 3200;
                if (x) {
                    player.account.addNewBalance(-3200);
                }
                break;
            case 15:
                //DFDS = 4000;
                if (x) {
                    player.account.addNewBalance(-4000);
                }
                break;
            case 16:
               // Bernstofssvej = 3600;
                if (x) {
                    player.account.addNewBalance(-3600);
                }
                break;
            //case 17:
                //chanceCard.getChancecard(player, playerList,text);
                //break;
            case 18:
                //Hellerupsvej = 3600;
                if (x) {
                    player.account.addNewBalance(-3600);
                }
                break;
            case 19:
                //Strandvejen = 4000;
                if (x) {
                    player.account.addNewBalance(-4000);
                }
                break;
            case 20:
               int Helle = 1000;
                player.account.addNewBalance(+Helle);
                break;
            case 21:
                //Trianglen = 4400;
                if (x) {
                    player.account.addNewBalance(-4400);
                }
                break;
           // case 22:
                //chanceCard.getChancecard(player, playerList,text);
               // break;
            case 23:
              //Østerbrogade = 4400;
                if (x) {
                    player.account.addNewBalance(-4400);
                }
                break;
            case 24:
               // Grøningen = 4800;
                if (x) {
                    player.account.addNewBalance(-4800);
                }
                break;
            case 25:
                //ØS = 4000;
                if (x) {
                    player.account.addNewBalance(-4000);
                }
                break;
            case 26:
                //Bredgade = 5200;
                if (x) {
                    player.account.addNewBalance(-5200);
                }
                break;
            case 27:
                //KongensNytorv = 5200;
                if (x) {
                    player.account.addNewBalance(-5200);
                }
                break;
            case 28:
                //Carlsberg = 3000;
                if (x) {
                    player.account.addNewBalance(-3000);
                }
                break;
            case 29:
                //Østergade = 5600;
                if (x) {
                    player.account.addNewBalance(-5600);
                }
                break;
            //case 30:
                //Fængsel
                //break;
            case 31:
                //Amagertorv = 6000;
                if (x) {
                    player.account.addNewBalance(-6000);
                }
                break;
            case 32:
                //Vimmelskaftet = 6000;
                if (x) {
                    player.account.addNewBalance(-6000);
                }
                break;
            //case 33:
                //chanceCard.getChancecard(player, playerList,text);
                //break;
            case 34:
                //Nygade = 6400;
                if (x) {
                    player.account.addNewBalance(-6400);
                }
                break;
            case 35:
                //Bornholm = 4000;
                if (x) {
                    player.account.addNewBalance(-4000);
                }
                break;
            //case 36:
                //chanceCard.getChancecard(player, playerList,text);
                //break;
            case 37:
                //Frederiksberggade = 7000;
                if (x) {
                    player.account.addNewBalance(-7000);
                }
                break;
            case 38:
               // betalSkat2 = 2000;
                player.account.addNewBalance(-2000);
                break;
            case 39:
                //Rådhuspladsen = 8000;
                if (x) {
                    player.account.addNewBalance(-8000);
                }
                break;

        }


    }

}




