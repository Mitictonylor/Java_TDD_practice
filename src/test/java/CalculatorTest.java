import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;


    @Before
    public void before(){
        calculator = new Calculator();
    }
    @Test
        public void add(){
        assertEquals(5, calculator.add(2,3));

    }

    @Test
    public void subtract(){
        assertEquals(5, calculator.subtract(7,2));

    }
    @Test
    public void multiply(){
        assertEquals(14, calculator.multiply(7,2));

    }
    @Test
    public void divide(){
        assertEquals(2.5, calculator.divide(5,2), 0.01);
    }

}
