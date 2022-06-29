package MathOperations.Minus;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MinusTests {

    @Test
    public void checkCorrectMinus() {
        MinusMethods minusMethods = new MinusMethods();
        Assert.assertTrue(100 == minusMethods.mines(200, 100));
    }

    @Test
    public void check2CorrectMinus() {
        MinusMethods minusMethods = new MinusMethods();
        Assert.assertTrue(500 == minusMethods.mines(600, 100));
    }

    @Test
    public void checkNonCorrectMinus() {
        MinusMethods minusMethods = new MinusMethods();
        Assert.assertFalse(100 == minusMethods.mines(200, 150));
    }

    @Test
    public void check2NonCorrectMinus() {
        MinusMethods minusMethods = new MinusMethods();
        Assert.assertFalse(50 == minusMethods.mines(55, 45));
    }

    @Test
    public void checkEqualsCorrectMinus() {
        MinusMethods minusMethods = new MinusMethods();
        Assert.assertEquals(100 , minusMethods.mines(160, 60));
    }

    @Test
    public void check2EqualsCorrectMinus() {
        MinusMethods minusMethods = new MinusMethods();
        Assert.assertEquals(74 , minusMethods.mines(100, 26));
    }
}
