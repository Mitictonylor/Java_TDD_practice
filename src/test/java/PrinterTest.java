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

    @Test
    public  void getToner(){
        assertEquals(100, printer.getToner());
    }
    @Test
    public void checkAfterPrintTheLeftPaperAmountGoesDown(){
        printer.print(10,4);
        assertEquals(10, printer.getLeftPaper());
        assertEquals(60, printer.getToner());
    }
}
