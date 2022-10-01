package lab_8;

public class Employee {
    private int salary;
    public String eployeeType;

    public String getEployeeType() {
        return eployeeType;
    }

    public void setEployeeType(String eployeeType) {
        this.eployeeType = eployeeType;
    }

    public Employee() {
    }

    public Employee(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                '}';
    }
}

