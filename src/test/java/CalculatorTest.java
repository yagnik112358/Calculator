import static org.junit.Assert.*;

import com.calculator.Calculator;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();
    @Test
    public void sqrtTruePositive(){
        assertEquals("Testing true +ve for sqrt",Math.sqrt(16),calculator.sqrt( 16),DELTA);
        assertEquals("Testing true +ve for sqrt",Math.sqrt(5.43),calculator.sqrt( 5.43),DELTA);
    }
    @Test
    public void sqrtFalsePositive(){
        assertNotSame("Testing False +ve for sqrt",3,calculator.sqrt(8));
        assertNotSame("Testing False +ve for sqrt",2.5,calculator.sqrt(6));
    }
    @Test
    @Disabled("not implemented yet")
    public void factorialTruePositive(){
        assertEquals("Testing true +ve for factorial",24,calculator.factorial(4),DELTA);
        assertEquals("Testing true +ve for factorial",120,calculator.factorial( 5),DELTA);
    }
    @Test
    @Disabled("Still not implemented")
    public void factorialFalsePositive(){
        assertNotSame("Testing False +ve for factorial",3,calculator.factorial(3));
        assertNotSame("Testing False +ve for factorial",0,calculator.factorial(1));
    }
    @Test
    public void logTruePositive(){
        assertEquals("Testing true +ve for log",Math.log(24),calculator.log( 24),DELTA);
        assertEquals("Testing true +ve for log",Math.log(5.43),calculator.log( 5.43),DELTA);
    }
    @Test
    public void logFalsePositive(){
        assertNotSame("Testing False +ve for log",2,calculator.log(8));
        assertNotSame("Testing False +ve for log",2.5,calculator.log(6));
    }
    @Test
    public void powerTruePositive(){
        assertEquals("Testing true +ve for POWER",Math.pow(3,2),calculator.power( 3,2),DELTA);
        assertEquals("Testing true +ve for POWER",Math.pow(2,5.43),calculator.power( 2,5.43),DELTA);
    }
    @Test
    public void powerFalsePositive(){
        assertNotSame("Testing False +ve for POWER",33,calculator.power(2,5));
        assertNotSame("Testing False +ve for POWER",8,calculator.power(2,3.2));
    }
}
