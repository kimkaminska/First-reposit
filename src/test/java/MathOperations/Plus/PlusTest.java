package MathOperations.Plus;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PlusTest {

    @Test
    public void checkCorrectPlus() {
        PlusMethods plusMethods = new PlusMethods();
        Assert.assertTrue(100 == plusMethods.plus(70, 30));
    }

    @Test
    public void check2CorrectPlus() {
        PlusMethods plusMethods = new PlusMethods();
        Assert.assertTrue(200 == plusMethods.plus(150, 50));
    }

    @Test
    public void checkNoncorrectPlus() {
        PlusMethods plusMethods = new PlusMethods();
        Assert.assertFalse(100 == plusMethods.plus(50, 30));
    }

    @Test
    public void check2NoncorrectPlus() {
        PlusMethods plusMethods = new PlusMethods();
        Assert.assertFalse(100 == plusMethods.plus(80, 30));
    }

    @Test
    public void equalsCorrectPlus() {
        PlusMethods plusMethods = new PlusMethods();
        Assert.assertEquals(100 , plusMethods.plus(82, 18));
    }

    @Test
    public void equals2CorrectPlus() {
        PlusMethods plusMethods = new PlusMethods();
        Assert.assertEquals(150 , plusMethods.plus(125, 25));
    }
}
