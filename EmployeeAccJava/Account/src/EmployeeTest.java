public class EmployeeTest {
    public static void main(String[] args) {
        // Create two Employee objects
        Employee employee1 = new Employee("John", "Doe", 400);
        Employee employee2 = new Employee("Jane", "Smith", 600);

        // Display each object's yearly salary
        System.out.printf("John Doe yearly salary: $%.2f%n", employee1.yearlySalary());
        System.out.printf("Jane Smith yearly salary: $%.2f%n", employee2.yearlySalary());

        // Give each Employee a 10% raise
        employee1.raiseSalary(10);
        employee2.raiseSalary(10);

        // Display each Employee's yearly salary after the raise
        System.out.println("\nAfter giving a 10% raise:");
        System.out.printf("John Doe yearly salary = $%.2f%n", employee1.yearlySalary());
        System.out.printf("Jane Smith  yearly salary = $%.2f%n", employee2.yearlySalary());
    }
}
