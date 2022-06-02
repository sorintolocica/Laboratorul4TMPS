package LiskovSubstitutionPrinciple;

public class TemporaryEmployee extends Employee {
    public TemporaryEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public double calculateBonus(double salary) {
        return salary * 0.05; // bonus is 5 percent
    }

    @Override
    public double getMinimumSalary() {
        return 9500;
    }
}
