package InterfaceSegregationPrinciple;

public class Main {

    public static void main(String[] args) {
        ExpensiveOfficePrinter expensiveOfficePrinter = new ExpensiveOfficePrinter();
        CheapHomePrinter cheapHomePrinter = new CheapHomePrinter();

        // primul printer.
        System.out.println("Folosind cel scump:");
        System.out.println("Succes: " + expensiveOfficePrinter.printContent("Mesaj foarte important!"));
        System.out.println("Succes: " + expensiveOfficePrinter.scanContent("Mesaj foarte important!"));
        System.out.println("Succes: " + expensiveOfficePrinter.photoCopyContent("Mesaj foarte important!"));
        System.out.println("Succes: " + expensiveOfficePrinter.faxContent("Mesaj foarte important!"));

        System.out.println("");

        // al doilea printer
        System.out.println("Folosind cea ieftina:");
        System.out.println("Succes: " + cheapHomePrinter.printContent("Mesaj foarte important!"));
        System.out.println("Succes: " + cheapHomePrinter.scanContent("Mesaj foarte important!"));
        System.out.println("Succes: " + cheapHomePrinter.photoCopyContent("Mesaj foarte important!!"));
    }
}