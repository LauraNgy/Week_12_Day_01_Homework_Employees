package Staff;

public abstract class Employee {

    private String name;
    private String NINo;
    private double salary;

    public Employee(String name, String NiNo, double salary) {
        this.name = name;
        this.NINo = NiNo;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNINo() {
        return this.NINo;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double raise) {
        if (raise > 0 ) {
            this.salary += raise;
        }
    }

    public double payBonus() {
        return this.salary/100;
    }

    public void setName(String name) {
        if (!name.equals("")) {
            this.name = name;
        }
    }
}
