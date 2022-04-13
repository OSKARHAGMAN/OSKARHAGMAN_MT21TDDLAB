import java.util.ArrayList;

public class EmployeeList {
    private ArrayList<Employee> list = new ArrayList<>();

    public EmployeeList(ArrayList list) {
        this.list = list;
    }

    public ArrayList getArrayList() {
        return list;
    }

    public void addEmployee(String name, int age, double salary) {
        list.add(new Employee(name, age, salary));
    }

    public void removeEmployee(int index) {
        list.remove(index);
    }

    public void changeEmployeeElementValues(String name, int age, double salary, int index) {
        list.get(index).setName(name);
        list.get(index).setAge(age);
        list.get(index).setSalary(salary);
    }

    public void yearlyPayRaise(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            for (int i = 0; i < list.size(); i++) {
                double newSalary = list.get(i).getSalary();
                newSalary = (newSalary / 100.0) * percentage + newSalary;
                list.get(i).setSalary(newSalary);
            }
        }
    }
    public void individualPayRaise(int index, double percentage){
        double newSalary = list.get(index).getSalary();
        newSalary = (newSalary / 100.0) * percentage + newSalary;
        list.get(index).setSalary(newSalary);
    }
}
