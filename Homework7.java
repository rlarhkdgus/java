public class Homework7 {
    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T730DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while (inkjet.print());
        while (laser.print());
    }
}

abstract class Printer {
    String model;
    int printedCount;
    int availableCount;
    abstract boolean print();
}

class InkjetPrinter extends Printer {
    InkjetPrinter(String model, int count) {
        this.model = model;
        this.availableCount = count;
    }
    boolean print() {
        if(availableCount > 0) {
            availableCount--;
            printedCount++;
            return true;
        }
        else {
            System.out.printf("%s: %d매째 인쇄 실패 - 잉크 부족.\n",model,printedCount+1);
            return false;
        }
    }
}

class LaserPrinter extends Printer {
    LaserPrinter(String model, int count) {
        this.model = model;
        this.availableCount = count;
    }
    boolean print() {
        if(availableCount > 0) {
            availableCount--;
            printedCount++;
            return true;
        }
        else {
            System.out.printf("%s: %d매째 인쇄 실패 - 토너 부족.\n",model,printedCount+1);
            return false;
        }
    }
}