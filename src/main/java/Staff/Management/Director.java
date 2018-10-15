package Staff.Management;

public class Director extends Manager {

    private double budget;

    public Director(String name, String NiNo, double salary, String deptName, double budget) {
        super(name, NiNo, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }

    public double payBonus() {
        double salary = getSalary();
        return salary*2/100;
    }
}
