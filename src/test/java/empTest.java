import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class empTest {
    private EmployeeList employeeListTestObj;
    private ArrayList<Employee> list = new ArrayList<>();


    @BeforeEach
    public void setUp() {
        employeeListTestObj = new EmployeeList(list);
    }

    @Test
    public void addToEmployeeListTest() {
        employeeListTestObj.addEmployee("Oskar", 31, 11000);
        list = employeeListTestObj.getArrayList();
        assertEquals(1, list.get(0).getEmployeeId());
        assertEquals("Oskar", list.get(0).getName());
        assertEquals(31, list.get(0).getAge());
        assertEquals(11000, list.get(0).getSalary());
    }

    @Test
    public void clearDataOnIndexTest() {

    }


    @Test
    public void setNewValuesOnEmployeeOnSpecificIndexTest() {

    }

}
