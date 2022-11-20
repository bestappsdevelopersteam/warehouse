package warehouse.project.entity;

public class Employee {

    private int employee_id;
    private String first_name;
    private String last_name;
    private int age;
    private double salary;

    public Employee () {

    }

    public Employee(int employee_id, String first_name, String last_name, int age, double salary) {
        this.employee_id = employee_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.salary = salary;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private static boolean validateInput(String input) {

        try {
            int commandNumber = Integer.parseInt(input);
            if (commandNumber <= 0 || commandNumber > 12) {
                System.out.println("Invalid command! Try again! The input must be number between 1 and 12 ");
                return false;
            }

            return true;
        } catch (Exception NumberFormatException) {
            System.out.println("Invalid command! Try again! The input must be number between 1 and 12 ");
            return false;

        }
    }
}