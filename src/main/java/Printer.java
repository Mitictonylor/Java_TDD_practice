public class Printer {
    private int leftPaper;
    private int toner;

    public Printer( int leftPaper, int toner){
        this.leftPaper = leftPaper;
        this.toner = toner;
    }

    public int getLeftPaper(){
        return this.leftPaper;
    }

    public int getToner(){
        return this.toner;
    }

    public void setLeftPaper(int paperLeft){
        this.leftPaper = paperLeft;
    }

    public void setToner(int toner){
        this.toner = toner;
    }

    public void print(int numberOfPages, int howManyCopies){
        int beforePrintPaperLeft = this.getLeftPaper();
        int beforePrintToner = this.getToner();
        int neededPaperForPrint = numberOfPages * howManyCopies;
        this.setLeftPaper(beforePrintPaperLeft - neededPaperForPrint);
        this.setToner(beforePrintToner - neededPaperForPrint);
    }


}
