import java.util.Scanner;

class Empl {
    private int empl_Id;
    private String empl_Name;
    private double basicSalary;
    private double grossSalary;

    
    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Employee ID: ");
        empl_Id = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Employee Name: ");
        empl_Name = scanner.nextLine();

        System.out.print(" Basic Salary: ");
        basicSalary = scanner.nextDouble();

        
        calculateGrossSalary();
    }


    private void calculateGrossSalary() {
        double hra = 0.10 * basicSalary; 
        double da = 0.05 * basicSalary;
        grossSalary = basicSalary + hra + da;
    }

    // Method to display employee details and gross salary
    public void displayDetails() {
        System.out.println("Employee ID: " + empl_Id);
        System.out.println("Employee Name: " + empl_Name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Gross Salary: " + grossSalary);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee empl = new EmployeeDetails();
        empl.acceptDetails();
        empl.displayDetails();
    }
}
