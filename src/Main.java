public class Main {
    public static void main(String [] args) {
        WritingDesk writingDesk = new WritingDesk(3,false,50,50,100);
        writingDesk.adjustHeight(50);
        writingDesk.moveDown(20);
    }
}
