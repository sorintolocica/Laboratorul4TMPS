package LiskovSubstitutionPrinciple;

public class PermanentEmployee extends Employee {
    public PermanentEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public double calculateBonus(double salary) {
        return salary * 0.1;
    }

    @Override
    public double getMinimumSalary() {
        return 14000;
    }
}