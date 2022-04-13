public class Employee {
    private static int count = 1;
    private int employeeId;
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.employeeId = count++;
    }
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }
    public void setName(String newName){
        name = newName;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int newAge){
        age = newAge;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double newSalary){
        salary = newSalary;
    }

}
