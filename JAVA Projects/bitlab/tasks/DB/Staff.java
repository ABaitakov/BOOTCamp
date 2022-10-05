package kz.tasks.DB;

public class Staff {
    private String name;
    private String surname;
    private String department;
    private int salary;

    public Staff() {
    }
    public Staff(String name, String surname, String department, int salary) {
        this.name=name;
        this.surname=surname;
        this.department=department;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getDepartment() {
        return department;
    }
    public int getSalary() {
        return salary;
    }
}
