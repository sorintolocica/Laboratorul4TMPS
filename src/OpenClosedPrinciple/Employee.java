package OpenClosedPrinciple;

public abstract class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        setId(id);
        setName(name);
    }

    public abstract double calculateBonus(double salary);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

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