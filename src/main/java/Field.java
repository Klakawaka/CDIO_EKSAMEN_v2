/*
public class Field {
    public Player owner;
    String title;

    public Field(String title) {
        this.title = title;
    }

    //Denne linje nedenunder skal være til, ellers er der umiddelbart et problem i Board klassen.
    public void fields(Player player, int position, boolean buyButton, Player[] playerList) {

    }

    class StreetField extends Field {
         public int StreetField(int price) {

             return price;
         }

        public StreetField(String title) {
            super(title);
        }

        //StreetField Rødovrevej = new StreetField();
        //StreetField Hvidovrevej = new StreetField();
        //StreetField Øresund = new StreetField();
        //StreetField Roskildevej = new StreetField();
        //StreetField Valbylandsgade = new StreetField();
        //StreetField Allégade = new StreetField("Skal det her måske sættes i Board klassen?");
        //StreetField 8 = new StreetField();
        //StreetField 9 = new StreetField();
        //StreetField 10 = new StreetField();
        //StreetField 11 = new StreetField();
        //StreetField 12 = new StreetField();
        //StreetField 13 = new StreetField();
        //StreetField 14 = new StreetField();
        //StreetField 15 = new StreetField();
        //StreetField 16 = new StreetField();
        //StreetField 17 = new StreetField();
        //StreetField 18 = new StreetField();
        //StreetField 19 = new StreetField();
        //StreetField 20 = new StreetField();
        //StreetField 21 = new StreetField();
        //StreetField 22 = new StreetField();
        //StreetField 23 = new StreetField();
        //StreetField 24 = new StreetField();
        //StreetField 25 = new StreetField();
        //...




        public void buy() {
            this.owner =  owner;
        }


    }

    class TaxFields extends Field {
        int tax;

        public TaxFields(String title) {
            super(title);
        }
    }


    //public StreetField(String title) {
    //super(title);
}


        // {
        // String title;
        // public Player owner;

        // public Field(String title) {
        // this.title = title;
        // }
        // public void buy (Player x) {
        // this.owner = x;
        // }}


/*{
/*String title;
public Field(String title) {
   this.title = title;

 */



 /// Original
public class Field {

    int Start,Rødovrevej,Hvidovrevej,betalSkat1,Øresund,Roskildevej,
            Valbylandgade,Allegade,
            FrederiksbergAlle,Tuborg,Bülowsvej,GammelKongevej,
            DFDS,Bernstofssvej,Hellerupsvej,
            Strandvejen,Helle,Trianglen,Østerbrogade,
            Grøningen,ØS,Bredgade,KongensNytorv,Carlsberg,Østergade,
            Amagertorv,Vimmelskaftet,Nygade,Bornholm,
            Frederiksberggade,betalSkat2,Rådhuspladsen;
    ///int owner;

    //ChanceCard chanceCard = new ChanceCard();
    public void fields(Player player,int playerpos,boolean x){//, Player[] playerList,int text){
        switch (playerpos){
            case 0:
               Start = 200;
               player.account.addNewBalance(+200);
               break;
            case 1:
                Rødovrevej = 60;
                if (x) {
                    player.account.addNewBalance(-60);
                }
                break;
            case 2:
                //chanceCard.getChancecard(player, playerList,text);
                break;
            case 3:
              Hvidovrevej = 60;
                if (x) {
                    player.account.addNewBalance(-60);
                }
              break;
            case 4:
                betalSkat1 = 200;
                player.account.addNewBalance(-200);
                break;
            case 5:
                Øresund = 200;
                if (x) {
                    player.account.addNewBalance(-200);
                }
                break;
            case 6:
                Roskildevej = 100;
                if (x) {
                    player.account.addNewBalance(-100);
                }
                break;
            case 7:
                //chanceCard.getChancecard(player, playerList,text);
                break;
            case 8:
                Valbylandgade = 100;
                if (x) {
                    player.account.addNewBalance(-100);
                }
                break;
            case 9:
                Allegade = 120;
                if (x) {
                    player.account.addNewBalance(-120);
                }
                break;
            case 10:
                //Fængsel
                break;
            case 11:
                FrederiksbergAlle =140;
                if (x) {
                    player.account.addNewBalance(-140);
                }
                break;
            case 12:
                Tuborg = 150;
                if (x) {
                    player.account.addNewBalance(-150);
                }
                break;
            case 13:
                Bülowsvej =140;
                if (x) {
                    player.account.addNewBalance(-140);
                }
                break;
            case 14:
                GammelKongevej = 140;
                if (x) {
                    player.account.addNewBalance(-140);
                }
                break;
            case 15:
                DFDS = 200;
                if (x) {
                    player.account.addNewBalance(-200);
                }
                break;
            case 16:
                Bernstofssvej = 180;
                if (x) {
                    player.account.addNewBalance(-180);
                }
                break;
            case 17:
                //chanceCard.getChancecard(player, playerList,text);
                break;
            case 18:
                Hellerupsvej = 180;
                if (x) {
                    player.account.addNewBalance(-180);
                }
                break;
            case 19:
                Strandvejen = 180;
                if (x) {
                    player.account.addNewBalance(-180);
                }
                break;
            case 20:
                Helle = 0;
                break;
            case 21:
                Trianglen = 220;
                if (x) {
                    player.account.addNewBalance(-220);
                }
                break;
            case 22:
                //chanceCard.getChancecard(player, playerList,text);
                break;
            case 23:
              Østerbrogade = 220;
                if (x) {
                    player.account.addNewBalance(-220);
                }
                break;
            case 24:
                Grøningen = 240;
                if (x) {
                    player.account.addNewBalance(-240);
                }
                break;
            case 25:
                ØS = 200;
                if (x) {
                    player.account.addNewBalance(-200);
                }
                break;
            case 26:
                Bredgade = 260;
                if (x) {
                    player.account.addNewBalance(-260);
                }
                break;
            case 27:
                KongensNytorv = 260;
                if (x) {
                    player.account.addNewBalance(-260);
                }
                break;
            case 28:
                Carlsberg = 150;
                if (x) {
                    player.account.addNewBalance(-150);
                }
                break;
            case 29:
                Østergade = 280;
                if (x) {
                    player.account.addNewBalance(-280);
                }
                break;
            case 30:
                //Fængsel
                break;
            case 31:
                Amagertorv = 300;
                if (x) {
                    player.account.addNewBalance(-300);
                }
                break;
            case 32:
                Vimmelskaftet = 300;
                if (x) {
                    player.account.addNewBalance(-300);
                }
                break;
            case 33:
                //chanceCard.getChancecard(player, playerList,text);
                break;
            case 34:
                Nygade = 320;
                if (x) {
                    player.account.addNewBalance(-320);
                }
                break;
            case 35:
                Bornholm = 200;
                if (x) {
                    player.account.addNewBalance(-200);
                }
                break;
            case 36:
                //chanceCard.getChancecard(player, playerList,text);
                break;
            case 37:
                Frederiksberggade = 350;
                if (x) {
                    player.account.addNewBalance(-350);
                }
                break;
            case 38:
                betalSkat2 = 100;
                player.account.addNewBalance(-100);
                break;
            case 39:
                Rådhuspladsen = 400;
                if (x) {
                    player.account.addNewBalance(-400);
                }
                break;

        }


    }

}




