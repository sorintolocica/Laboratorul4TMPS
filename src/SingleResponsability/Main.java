package SingleResponsability;

public class Main {
    public static void main(String args[]) {

        Employee peggy = new Employee(1, "Sorin","Contabilitate", true);
        Main.hireNewEmployee(peggy);
        printEmployeeReport(peggy, FormatType.CSV);
        printEmployeeReport(peggy, FormatType.XML);

    }

    public static void hireNewEmployee(Employee employee){
        EmployeeDAO employeeDao = new EmployeeDAO();
        employeeDao.saveEmployee(employee);
    }

    public static void terminateEmployee(Employee employee){
        EmployeeDAO employeeDao = new EmployeeDAO();
        employeeDao.removeEmployee(employee);
    }

    public static void printEmployeeReport(Employee employee, FormatType formatType){
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);

        System.out.println(formatter.getFormattedEmployee());

    }

}
