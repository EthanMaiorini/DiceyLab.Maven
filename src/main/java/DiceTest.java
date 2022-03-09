import DiceyLab.Dice;
import org.testng.Assert;
import org.testng.annotations.Test;



public class DiceTest {

@Test
    public void TesttossandSum() {
            // Given
            int x;
            Dice dice = new Dice(2);

            // When
            x = dice.tossandSum();

            // Then

            Assert.assertTrue((0< x)&&(x < 13));
        }

    }
