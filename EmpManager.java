import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private String name;
    private double salary;

    
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    
    public void display() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

// Main class
public class EmployeeData {
    public static void main(String[] args) {
        
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        
        employees.add(new Employee("Ali", 50000));
        employees.add(new Employee("Hamza", 60000));
        employees.add(new Employee("Zara", 55000));

        
        System.out.println("\nEmployees List:");
        for (Employee emp : employees) {
            emp.display();
        }

        
        System.out.print("\nEnter employee name to remove: ");
        String removeName = scanner.nextLine();

        boolean removed = employees.removeIf(emp -> emp.getName().equalsIgnoreCase(removeName));

        
        if (removed) {
            System.out.println("\nEmployee removed successfully!");
        } else {
            System.out.println("\nEmployee not found!");
        }

        
        System.out.println("\nUpdated Employees List:");
        for (Employee emp : employees) {
            emp.display();
        }

        
        scanner.close();
    }
}
