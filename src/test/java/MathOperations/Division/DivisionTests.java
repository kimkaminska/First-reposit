package MathOperations.Division;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivisionTests {

    @Test
    public void CheckCorrectDevision() {
        DivisionMethods devisionMethods = new DivisionMethods();
        Assert.assertTrue(5 == devisionMethods.devision(225, 45));
    }

    @Test
    public void CheckNonCorrectDevision() {
        DivisionMethods devisionMethods = new DivisionMethods();
        Assert.assertFalse(5 == devisionMethods.devision(60, 10));
    }

    @Test
    public void CheckCorrectDevisionDouble() {
        DivisionMethods devisionMethods = new DivisionMethods();
        Assert.assertTrue(44.6 == devisionMethods.devision(111.5, 2.5));
    }

    @Test
    public void CheckNonCorrectDevisionDouble() {
        DivisionMethods devisionMethods = new DivisionMethods();
        Assert.assertFalse(6.8 == devisionMethods.devision(212.8, 29.6));
    }

    @Test
    public void CheckCorrectEqualsDevisionDouble() {
        DivisionMethods devisionMethods = new DivisionMethods();
        Assert.assertEquals(10, devisionMethods.devision(26250, 2625));
    }

}
