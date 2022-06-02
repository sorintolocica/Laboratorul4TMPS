package OpenClosedPrinciple;

public class Main {

    public static void main(String[] args) {
        // no need to change how an employee is constructed (see OCP1)
        Employee john = new PermanentEmployee(1, "John");
        Employee jack = new TemporaryEmployee(2, "Jack");

        System.out.println(john + " bonus = " + john.calculateBonus(10000));
        System.out.println(jack + " bonus = " + jack.calculateBonus(15000));
    }
}