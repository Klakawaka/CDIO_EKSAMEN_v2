import java.lang.Math;

public class ChanceCard {

    private final int MAX = 12 ;
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
