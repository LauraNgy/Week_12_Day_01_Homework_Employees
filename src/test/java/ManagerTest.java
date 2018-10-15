import Staff.Employee;
import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Employee employee;

    @Before
    public void before() {
        employee = new Manager("Billy Joe Jimbob", "AR374902S", 40000.00, "Edinburgh");
    }

    @Test
    public void hasName() {
        assertEquals("Billy Joe Jimbob", employee.getName());
    }

    @Test
    public void hasNINo() {
        assertEquals("AR374902S", employee.getNINo());
    }

    @Test
    public void hasSalary() {
        assertEquals(40000.00, employee.getSalary(), 0.1);
    }

    @Test
    public void hasDeptName() {
        Manager manager = (Manager) employee;
        assertEquals("Edinburgh", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        employee.raiseSalary(5000.50);
        assertEquals(45000.50, employee.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus() {
        assertEquals(400.00, employee.payBonus(), 0.1);
    }
}
