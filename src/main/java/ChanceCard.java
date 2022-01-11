import java.lang.Math;

public class ChanceCard {

    private final int MAX = 30 ;
    public int getChancecard(Player player) {

        int card = (int) (Math.random() * MAX) + 1;

        switch (card) {
            case 1:
           System.out.println("You have ran into a full stop, pay 1000 kr in fine");
                player.account.addNewBalance(-1000);
                break;
            case 2:
                System.out.println("Pay 300 kr for a car wash and greasing");
                player.account.addNewBalance(-300);
                break;
            case 3:
                System.out.println("Pay 200 kr for delivery of 2 crates of beer");
                player.account.addNewBalance(-200);
            case 4:
                System.out.println("Pay 3000 kr for car repair");
                player.account.addNewBalance(-3000);
            case 5:
                System.out.println("Pay 3000 kr for car repair");
                player.account.addNewBalance(-3000);
            case 6:
                System.out.println("You have bought 4 new tyres for your car, pay 1000 kr");
                player.account.addNewBalance(-1000);
            case 7:
                System.out.println("You have received a parking ticket, pay 200 kr fine");
                player.account.addNewBalance(-200);
            case 8:
                System.out.println("Pay your car insurance, kr 1000");
                player.account.addNewBalance(-1000);
            case 9:
                System.out.println("You have been overseas and bought too many cigarettes, pay 200 kr in customs duty");
                player.account.addNewBalance(-200);
            case 10:
                System.out.println("Dental bill, pay 2000 kr");
                player.account.addNewBalance(-2000);
            case 11:
                System.out.println("You have won the lottery, receive 500 kr.");
                player.account.addNewBalance(+500);
            case 12:
                System.out.println("You have won the lottery, receive 500 kr.");
                player.account.addNewBalance(+500);
            case 13:
                System.out.println("You receive your dividend. Receive 1000 kr from the bank");
                player.account.addNewBalance(+1000);
            case 14:
                System.out.println("You receive your dividend. Receive 1000 kr from the bank");
                player.account.addNewBalance(+1000);
            case 15:
                System.out.println("You receive your dividend. Receive 1000 kr from the bank");
                player.account.addNewBalance(+1000);
            case 16:
                System.out.println("The council has remitted the tax of one quarter. Withdraw 3000 kr from the bank");
                player.account.addNewBalance(+3000);
            case 17:
                System.out.println("You got a row of eleven correct on the pools. Receive 1000 kr.");
                player.account.addNewBalance(+1000);
            case 18:
                System.out.println("Because of the inflation, you get a wage increase. Receive 1000 kr.");
                player.account.addNewBalance(+1000);
            case 19:
                System.out.println("Your premium bond has returned. Receive 1000 kr from the bank");
                player.account.addNewBalance(+1000);
            case 20:
                System.out.println("Your premium bond has returned. Receive 1000 kr from the bank");
                player.account.addNewBalance(+1000);
            case 21:
                System.out.println("You have auctioned off some old furniture. Receive 1000 kr from the bank.");
                player.account.addNewBalance(+1000);
            case 22:
                System.out.println("The value of self-grown from the kitchen garden make up 200 kr which you receive from the bank");
                player.account.addNewBalance(+200);
            case 23:
                System.out.println("Move to start position");
                player.setPosition(0);
            case 24:
                System.out.println("Move 3 fields forward");
                player.addpostion(3);
            case 25:
                System.out.println("Move 3 fields back");
                player.addpostion(-3);
                if (player.position < 0) {
                    player.position = 0;
                }
            case 26:
                System.out.println("Move 3 fields back");
                player.addpostion(-3);
                if (player.position < 0) {
                    player.position = 0;
                }
            case 27:
                System.out.println("move forward to Frederiksberg Allé, If you pass the start then collect 4000 kr");
                if (player.position > 11) {
                    player.account.addNewBalance(+4000);
                    player.setPosition(11);}
                else {player.setPosition(11);}
            case 28:
                System.out.println("Go with Mols-linien, move your car forward and if you pass the start position then collect 4000 kr");
            case 29:
                System.out.println("Move to jail. You DON'T collect 4000 kr if you pass the start");
                player.setPosition(10);
            case 30:
                System.out.println("Move to jail. You DON'T collect 4000 kr if you pass the start");
                player.setPosition(10);


                /*
                System.out.println("Du skal rykke 3 felter frem");
                player.addpostion(3);
                break;
            case 4:
                System.out.println("Du skal Rykke 3 felter tilbage");
                player.addpostion(-3);
                if (player.position < 0) {
                    player.position = 0;
                }
                break;
            case 5:
                System.out.println("Du skal i fængsel i en runde");
                player.setPosition(6); //6 er position for fængsel
                break;
            case 6:
                System.out.println("Du skal rykke 5 felter frem");
                player.addpostion(5);

                break;
            case 7:
                System.out.println("Du skal rykke 5 felter tilbage");
                player.addpostion(-5);
                if (player.position < 0 ) {
                    player.position = 0;
                }
            case 8:
                System.out.println("Du får en gave på 300 dollars");
                player.account.addNewBalance(+300);
                break;
            case 9:
                System.out.println("Du får en bøde på 300 dollars");
                player.account.addNewBalance(-300);
                break;
            case 10:
                System.out.println("Du skal i fængsel i en runde");
                player.setPosition(7); //7 er position for fængsel
                break;
            case 11:
                System.out.println("Du får en gave på 500 dollars");
                player.account.addNewBalance(+500);
                break;
            case 12:
                System.out.println("Du får en bøde på 500 dollars");
                player.account.addNewBalance(-500);
                break;
            case 13:
                System.out.println(""); */
        }
        return card;
    }
}