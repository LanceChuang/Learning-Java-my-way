package lesson1;

/*This class encapsulates class variables so other class can only access getSalary method, not able to modify variables*/
public class Employee {
    private int employeeId;
    private String name;
    private String identityNum;
    private int years;

    Employee(int employeeId, String name, String identityNum, int years) {
        this.employeeId = employeeId;
        this.name = name;
        this.identityNum = identityNum;
        this.years = years;
    }
    public int getSalary(int years) {
        int salary = years * 4;
        return salary;
    }
}
