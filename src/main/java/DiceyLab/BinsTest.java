package DiceyLab;

import org.junit.Test;
import org.testng.Assert;


public class BinsTest {

    @Test
    public void getBinTest() {
        // Given
        int x =1;
        Bins bin = new Bins(2,12);

        // When
        bin.incrementBin(10);

        // Then
        int binnum = bin.getBin(10);
        Assert.assertEquals(binnum,x);
    }

    @Test
    public void incrementBinTest() {
        // Given

        Bins bin = new Bins(2,12);

        // When
        int x = bin.getBin(10);
        bin.incrementBin(10);

        // Then
        int binnum = bin.getBin(10);
        Assert.assertTrue(binnum == x+1);
    }
}