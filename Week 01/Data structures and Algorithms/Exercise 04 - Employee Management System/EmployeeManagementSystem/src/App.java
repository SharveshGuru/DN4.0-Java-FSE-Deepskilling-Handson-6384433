public class App {
    public static void main(String[] args) throws Exception {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(5);

        Employee emp1 = new Employee(101, "Alice", "Manager", 75000);
        Employee emp2 = new Employee(102, "Bob", "Developer", 60000);
        Employee emp3 = new Employee(103, "Charlie", "Designer", 55000);

        ems.addEmployee(emp1);
        ems.addEmployee(emp2);
        ems.addEmployee(emp3);

        System.out.println("\n--- All Employees ---");
        ems.traverseEmployees();

        System.out.println("\n--- Search Employee with ID 102 ---");
        Employee result = ems.searchEmployee(102);
        if (result != null) {
            result.displayInfo();
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\n--- Delete Employee with ID 102 ---");
        ems.deleteEmployee(102);

        System.out.println("\n--- Updated Employee List ---");
        ems.traverseEmployees();

        ems.addEmployee(new Employee(104, "David", "QA", 50000));
        ems.addEmployee(new Employee(105, "Eva", "Support", 45000));
        ems.addEmployee(new Employee(106, "Frank", "HR", 47000)); // This should not be added
    }
}
