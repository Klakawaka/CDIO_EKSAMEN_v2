import java.lang.Math;

public class ChanceCard {

    private final int MAX = 12 ;
    public int getChancecard(Player player) {

        int card = (int) (Math.random() * MAX) + 1;

        switch (card) {
            case 1:
                System.out.println("Du får en gave på 200 dollars");
                player.account.addNewBalance(+200);
                break;
            case 2:
                System.out.println("Du får en bøde på 200 dollars");
                player.account.addNewBalance(-200);
                break;
            case 3:
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
        }
        return card;
    }
}
