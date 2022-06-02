package LiskovSubstitutionPrinciple;

public class Main {

    public static void main(String[] args) {

        EmployeeInterface john = new PermanentEmployee(1, "John");
        EmployeeInterface jack = new TemporaryEmployee(2, "Jack");
        // make a new employee that doesn't get any bonuses
        EmployeeInterface josef = new ContractEmployee(3, "Josef");


        System.out.println("Print out the minimum salaries:");
        System.out.println(john + " Minimum Salary = " + john.getMinimumSalary());
        System.out.println(jack + " Minimum Salary = " + jack.getMinimumSalary());
        System.out.println(josef + " Minimum Salary = " + josef.getMinimumSalary());


        System.out.println("");
        System.out.println("Print out the bonuses:");


        System.out.println(john + " bonus = " + ((Employee) john).calculateBonus(10000));

        System.out.println(jack + " bonus = " + ((TemporaryEmployee) jack).calculateBonus(15000));
    }
}
