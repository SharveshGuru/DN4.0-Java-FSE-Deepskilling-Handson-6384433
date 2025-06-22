public class EmployeeManagementSystem {
    private Employee[] employees;
    private int count;

    public EmployeeManagementSystem(int capacity) {
        employees = new Employee[capacity];
        count = 0;
    }

    public void addEmployee(Employee emp) {
        if (count < employees.length) {
            employees[count++] = emp;
            System.out.println("Employee added successfully.");
        } else {
            System.out.println("Employee list is full.");
        }
    }

    public Employee searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                return employees[i];
            }
        }
        return null;
    }

    public void traverseEmployees() {
        if (count == 0) {
            System.out.println("No employees found.");
        }
        for (int i = 0; i < count; i++) {
            employees[i].displayInfo();
        }
    }

    public void deleteEmployee(int id) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                found = true;
                // Shift remaining elements to the left
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null; // Remove last duplicate
                System.out.println("Employee deleted successfully.");
                break;
            }
        }
        if (!found) {
            System.out.println("Employee not found.");
        }
    }
}
