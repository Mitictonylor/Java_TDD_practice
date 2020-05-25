import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;
    Printer printerLowPaper;
    Printer printerLowToner;

    @Before
    public void before(){
        printer = new Printer(50,100);
        printerLowPaper = new Printer(10,100);
        printerLowToner = new Printer(100,10);
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
    @Test
    public void setToner(){
        printer.setToner(50);
        assertEquals(50, printer.getToner());
    }
    @Test
    public void setLeftPaper(){
        printer.setLeftPaper(10);
        assertEquals(10, printer.getLeftPaper());
    }
    @Test
    public void thereIsEnoughPaper(){
        assertEquals(true, printer.checkIfEnoughPaper(10));
    }
    @Test
    public void thereIsNotEnoughPaper(){
        assertEquals(false, printer.checkIfEnoughPaper(80));
    }
    @Test
    public void thereIsEnoughToner(){
        assertEquals(true, printer.checkIfEnoughToner(10));
    }
    @Test
    public void thereIsNotEnoughToner(){
        assertEquals(false, printer.checkIfEnoughToner(180));
    }
    @Test
    public void ThereIsEnoughPaperAndTonerAfterPrintTheLeftPaperAmountGoesDown(){
        printer.print(10,4);
        assertEquals(10, printer.getLeftPaper());
        assertEquals(60, printer.getToner());
    }
    @Test
    public void ThereIsNotEnoughPaperAndDoesNotPrint(){
        printer.print(50,4);
        assertEquals(50, printer.getLeftPaper());
        assertEquals(100, printer.getToner());
    }

    @Test
    public void ThereIsNotEnoughTonerAndDoesNotPrint(){
        printer.print(50,4);
        assertEquals(50, printer.getLeftPaper());
        assertEquals(100, printer.getToner());
    }
}
