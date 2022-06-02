package LiskovSubstitutionPrinciple;

public class ContractEmployee implements EmployeeInterface {
    private int id;
    private String name;

    public ContractEmployee(int id, String name) {
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
    public double getMinimumSalary() {
        return 10000;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}