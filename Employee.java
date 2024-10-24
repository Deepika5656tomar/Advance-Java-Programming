import java.util.Scanner;

public class Employee {
    private String name;
    private int id;
    private double salary;

    private void getInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee Name: ");
        name=sc.nextLine();

        System.out.println("Enter Employee ID: ");
        id=sc.nextInt();
        System.out.println("Enter Employee Salary: ");
        salary=sc.nextDouble();
    }
    public void showInput(){
        getInput();
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.showInput();
    }
    
}
