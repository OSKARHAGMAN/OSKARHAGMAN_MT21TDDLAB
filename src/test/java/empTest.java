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
        addToEmployeeListTest();
        addToEmployeeListTest();
        addToEmployeeListTest();
        employeeListTestObj.removeEmployee(0);
        assertEquals(2, list.get(0).getEmployeeId());
    }


    @Test
    public void setNewValuesOnEmployeeOnSpecificIndexTest() {
        addToEmployeeListTest();
        addToEmployeeListTest();
        addToEmployeeListTest();

        employeeListTestObj.changeEmployeeElementValues("Rasputin", 47, 0, 1);
        list = employeeListTestObj.getArrayList();
        assertEquals("Rasputin", list.get(1).getName());
        assertEquals(47, list.get(1).getAge());
        assertEquals(0, list.get(1).getSalary());
    }

}
