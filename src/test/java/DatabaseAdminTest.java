import Staff.Employee;
import Staff.TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private Employee employee;

    @Before
    public void before() {
        employee = new DatabaseAdmin("Billy Joe Jimbob", "AR374902S", 40000.00);
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
    public void canRaiseSalary() {
        employee.raiseSalary(5000.50);
        assertEquals(45000.50, employee.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus() {
        assertEquals(400.00, employee.payBonus(), 0.1);
    }
}
