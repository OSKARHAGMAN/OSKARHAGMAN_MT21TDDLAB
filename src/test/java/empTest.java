import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class empTest {
    private EmployeeList employeeListTestObj;
    private ArrayList<Employee> list = new ArrayList<>();
    double yearlyPercentRaise = 10.0;


    @BeforeEach
    public void setUp() {
        employeeListTestObj = new EmployeeList(list);
    }

    @Test
    public void addToEmployeeListTest() {
        employeeListTestObj.addEmployee("Oskar", 31, 11000);

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

        assertEquals("Rasputin", list.get(1).getName());
        assertEquals(47, list.get(1).getAge());
        assertEquals(0, list.get(1).getSalary());
    }

    @Test
    public void yearlyPayRaiseTest() {
        addToEmployeeListTest();
        addToEmployeeListTest();
        addToEmployeeListTest();
        setNewValuesOnEmployeeOnSpecificIndexTest();

        ArrayList<Double> tempSalaryList = new ArrayList<>();
        for (Employee employee : list) {
            tempSalaryList.add(employee.getSalary());
        }
        employeeListTestObj.yearlyPayRaise(yearlyPercentRaise);

        for (int i = 0; i < list.size(); i++) {
            double expected = ((tempSalaryList.get(i) / 100.0) * yearlyPercentRaise) + tempSalaryList.get(i);
            assertEquals(expected, list.get(i).getSalary());
        }


    }
}
