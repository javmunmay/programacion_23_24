package U9.T2MYSQL;

public class Employee {
    private int employeeNumber;
    private String lastName;
    private String firstName;

    // Constructor
    public Employee(int employeeNumber, String lastName, String firstName) {
        this.employeeNumber = employeeNumber;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    // Getters
    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}

