import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(50,100);
    }

    @Test
    public void getLeftPaper(){
        assertEquals(50, printer.getLeftPaper());
    }
}
