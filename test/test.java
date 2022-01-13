import org.junit.Test;
import static org.junit.Assert.*;

public class test {

    @Test

    public void test(){
        Dice die = new Dice();
        for (int i = 0; i < 101; i++) {
            int faceValue = die.roll();
            assertTrue(faceValue>=1);
            assertTrue(faceValue<=6);
        }
    }
}