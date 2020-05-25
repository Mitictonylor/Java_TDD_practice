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


}
