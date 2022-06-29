package MathOperations.Multiplication;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplicationTests {

    @Test
    public void checkCorrectMultiplication() {
        MultiplicationMethods multiplicationMethods = new MultiplicationMethods();
        Assert.assertTrue(100 == multiplicationMethods.multiplication(10, 10));
    }

    @Test
    public void checkNonCorrectMultiplication() {
        MultiplicationMethods multiplicationMethods = new MultiplicationMethods();
        Assert.assertFalse(100 == multiplicationMethods.multiplication(20, 10));
    }

    @Test
    public void checkCorrectMultiplicationFloat() {
        MultiplicationMethods multiplicationMethods = new MultiplicationMethods();
        Assert.assertTrue(5.52 == multiplicationMethods.multiplication(1.2, 4.6));
    }

    @Test
    public void checkNonCorrectMultiplicationDouble() {
        MultiplicationMethods multiplicationMethods = new MultiplicationMethods();
        Assert.assertFalse(6548606.5 == multiplicationMethods.multiplication(85650.8, 124.2));
    }

    @Test
    public void checkCorrectMultiplicationEquals() {
        MultiplicationMethods multiplicationMethods = new MultiplicationMethods();
        Assert.assertEquals(302940 , multiplicationMethods.multiplication(680, 445.5));
    }
}
