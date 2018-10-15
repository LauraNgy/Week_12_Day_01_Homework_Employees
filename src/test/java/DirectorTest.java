import Staff.Employee;
import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

        private Employee employee;

        @Before
        public void before() {
            employee = new Director("Billy Joe Jimbob", "AR374902S", 40000.00, "Edinburgh", 1000000.00);
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
            Director director = (Director) employee;
            assertEquals("Edinburgh", director.getDeptName());
        }

        @Test
        public void canRaiseSalary() {
            employee.raiseSalary(5000.50);
            assertEquals(45000.50, employee.getSalary(), 0.1);
        }

        @Test
        public void canPayBonus() {
            assertEquals(800.00, employee.payBonus(), 0.1);
        }

        @Test
    public void hasBudget() {
            Director director = (Director) employee;
            assertEquals(1000000.00, director.getBudget(), 0.1);
        }

}
