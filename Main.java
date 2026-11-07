public class Main {

    public static void main(String[] args) {

        Employee emp1 = new Employee(
                "Juan Dela Cruz", "EMP001", "IT", 25000.0);

        Employee emp2 = new Employee(
                "Maria Lopez", "EMP002", "HR", 22000.0);

        Manager emp3 = new Manager(
                "Carlo Mendoza", "EMP003", "IT", 45000.0, 8);

        System.out.println("===== EMPLOYEE INFORMATION =====");
        System.out.println();

        emp1.displayInfo();
        System.out.println();

        emp2.displayInfo();
        System.out.println();

        System.out.println("===== MANAGER =====");
        System.out.println();

        emp3.displayInfo();
        System.out.println();

        System.out.println("===== UPDATED INFORMATION =====");

        emp2.setMonthlySalary(24000.0);

        System.out.println("Name: " + emp2.getName());
        System.out.println("Monthly Salary: " + emp2.getMonthlySalary());

        System.out.println();

        System.out.println("===== ANNUAL SALARY =====");

        System.out.println(emp1.getName() + ": " + emp1.getAnnualSalary());
        System.out.println(emp2.getName() + ": " + emp2.getAnnualSalary());
        System.out.println(emp3.getName() + ": " + emp3.getAnnualSalary());

        // Reflection Questions

        // 1. Monthly salary is private to protect the data.
        // The setter prevents zero or negative salary values.

        // 2. Yes, a Manager is also an Employee because
        // Manager extends Employee.

        // 3. super.displayInfo() allows the Manager to reuse
        // the displayInfo() method from the Employee class.
    }
}
