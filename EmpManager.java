import java.util.ArrayList;
import java.util.Scanner;


class Employee 
{
    String name;
    double salary;


    Employee(String name, double salary)  
    {this.name = name;
        this.salary = salary;
    }

    
    void display() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}


public class EmpManager {
    public static void main(String[] args) {
        
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        
        employees.add(new Employee("Ali", 50000));
        employees.add(new Employee("Hamza", 60000));
        employees.add(new Employee("Zara", 55000));

        
        System.out.println("Employees List:");
        for (Employee emp : employees) {
            emp.display();
        }

        
        System.out.println("\nEnter employee name to remove:");
        String removeName = scanner.nextLine();

        
        employees.removeIf(emp -> emp.name.equalsIgnoreCase(removeName));

        
        System.out.println("\nUpdated Employees List:");
        for (Employee emp : employees) {
            emp.display();
        }

        scanner.close();
    }
}
