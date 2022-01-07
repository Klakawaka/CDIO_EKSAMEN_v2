public class Field {

    int Start,Rødovrevej,Hvidovrevej,betalSkat1,Øresund,Roskildevej,
            Valbylandgade,Allegade,
            FrederiksbergAlle,Tuborg,Bülowsvej,GammelKongevej,
            DFDS,Bernstofssvej,Hellerupsvej,
            Strandvejen,Helle,Trianglen,Østerbrogade,
            Grøningen,ØS,Bredgade,KongensNytorv,Carlsberg,Østergade,
            Amagertorv,Vimmelskaftet,Nygade,Bornholm,
            Frederiksberggade,betalSkat2,Rådhuspladsen;

    ChanceCard chanceCard = new ChanceCard();
    public void fields(Player player,int playerpos,boolean x){
        switch (playerpos){
            case 0:
               Start = 200;
               player.account.addNewBalance(+200);
               break;
            case 1:
                Rødovrevej = 60;
                if (x == true) {
                    player.account.addNewBalance(-60);
                }
                break;
            case 2:
                chanceCard.getChancecard(player);
                break;
            case 3:
              Hvidovrevej = 60;
                if (x == true) {
                    player.account.addNewBalance(-60);
                }
              break;
            case 4:
                betalSkat1 = 200;
                player.account.addNewBalance(-200);
            case 5:
                Øresund = 200;
                if (x == true) {
                    player.account.addNewBalance(-200);
                }
            case 6:
                Roskildevej = 100;
                if (x == true) {
                    player.account.addNewBalance(-100);
                }
            case 7:
                chanceCard.getChancecard(player);
                break;
            case 8:
                Valbylandgade = 100;
                if (x == true) {
                    player.account.addNewBalance(-100);
                }
            case 9:
                Allegade = 120;
                if (x == true) {
                    player.account.addNewBalance(-120);
                }
                break;
            case 10:
                //Fængsel
                break;
            case 11:
                FrederiksbergAlle =140;
                if (x == true) {
                    player.account.addNewBalance(-140);
                }
            case 12:
                Tuborg = 150;
                if (x == true) {
                    player.account.addNewBalance(-150);
                }
            case 13:
                Bülowsvej =140;
                if (x == true) {
                    player.account.addNewBalance(-140);
                }
            case 14:
                GammelKongevej = 140;
                if (x == true) {
                    player.account.addNewBalance(-140);
                }
            case 15:
                DFDS = 200;
                if (x == true) {
                    player.account.addNewBalance(-200);
                }
            case 16:
                Bernstofssvej = 180;
                if (x == true) {
                    player.account.addNewBalance(-180);
                }
            case 17:
                chanceCard.getChancecard(player);
                break;
            case 18:
                Hellerupsvej = 180;
                if (x == true) {
                    player.account.addNewBalance(-180);
                }
            case 19:
                Strandvejen = 180;
                if (x == true) {
                    player.account.addNewBalance(-180);
                }
                break;
            case 20:
                Helle = 0;
                break;
            case 21:
                Trianglen = 220;
                if (x == true) {
                    player.account.addNewBalance(-220);
                }
            case 22:
                chanceCard.getChancecard(player);

                break;
            case 23:
              Østerbrogade = 220;
                if (x == true) {
                    player.account.addNewBalance(-220);
                }
            case 24:
                Grøningen = 240;
                if (x == true) {
                    player.account.addNewBalance(-240);
                }
            case 25:
                ØS = 200;
                if (x == true) {
                    player.account.addNewBalance(-200);
                }
            case 26:
                Bredgade = 260;
                if (x == true) {
                    player.account.addNewBalance(-260);
                }
            case 27:
                KongensNytorv = 260;
                if (x == true) {
                    player.account.addNewBalance(-260);
                }
            case 28:
                Carlsberg = 150;
                if (x == true) {
                    player.account.addNewBalance(-150);
                }
            case 29:
                Østergade = 280;
                if (x == true) {
                    player.account.addNewBalance(-280);
                }
            case 30:
                //Fængsel
                break;
            case 31:
                Amagertorv = 300;
                if (x == true) {
                    player.account.addNewBalance(-300);
                }
            case 32:
                Vimmelskaftet = 300;
                if (x == true) {
                    player.account.addNewBalance(-300);
                }
            case 33:
                chanceCard.getChancecard(player);
                break;
            case 34:
                Nygade = 320;
                if (x == true) {
                    player.account.addNewBalance(-320);
                }
            case 35:
                Bornholm = 200;
                if (x == true) {
                    player.account.addNewBalance(-200);
                }
            case 36:
                chanceCard.getChancecard(player);
            case 37:
                Frederiksberggade = 350;
                if (x == true) {
                    player.account.addNewBalance(-350);
                }
            case 38:
                betalSkat2 = 100;
                player.account.addNewBalance(-100);
            case 39:
                Rådhuspladsen = 400;
                if (x == true) {
                    player.account.addNewBalance(-400);
                }

        }


    }

}
