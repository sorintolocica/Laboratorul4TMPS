package InterfaceSegregationPrinciple;

public class CheapHomePrinter implements PrinterTaskPrint, PrinterTaskScanAndCopy {
    @Override
    public boolean printContent(String content) {
        System.out.println("Content printed.");
        return true;
    }

    @Override
    public boolean scanContent(String content) {
        System.out.println("Content scanned.");
        return true;
    }

    @Override
    public boolean photoCopyContent(String content) {
        System.out.println("Content copied.");
        return true;
    }
}
