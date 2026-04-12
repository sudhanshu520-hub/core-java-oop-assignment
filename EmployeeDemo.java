class Employee {

    // Data members
    int empId;
    String empName;
    double salary;

    // Constructor to initialize object
    Employee(int id, String name, double sal) {
        empId = id;
        empName = name;
        salary = sal;
    }

    // Method to display details
    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

        // Object creation and initialization using constructor
        Employee e1 = new Employee(101, "Rahul", 50000);
        Employee e2 = new Employee(102, "Rahul", 60000);

        // Display details
        e1.display();
        System.out.println();
        e2.display();
    }
}
