package LiskovSubstitutionPrinciple;

public abstract class Employee implements EmployeeInterface, CalculateBonusInterface {
    int id;
    String name;

    public Employee(int id, String name) {
        setId(id);
        setName(name);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
