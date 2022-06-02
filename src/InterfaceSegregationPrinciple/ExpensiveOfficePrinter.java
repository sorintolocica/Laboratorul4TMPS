package InterfaceSegregationPrinciple;

public class ExpensiveOfficePrinter implements PrinterTaskPrint, PrinterTaskFax, PrinterTaskScanAndCopy {
    @Override
    public boolean printContent(String content) {
        System.out.println("Continut printat.");
        return true;
    }

    @Override
    public boolean scanContent(String content) {
        System.out.println("Continut scanat.");
        return true;
    }

    @Override
    public boolean faxContent(String content) {
        System.out.println("Continut prin fax.");
        return true;
    }

    @Override
    public boolean photoCopyContent(String content) {
        System.out.println("Continut copiat");
        return true;
    }
}
