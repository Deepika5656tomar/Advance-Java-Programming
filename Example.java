class User {
    int id;
    String name;

    public User(int id, String name){
        this.id=id;
        this.name=name;
    }
}
class Employee1 extends User{
    double salary;
    public Employee1(int id, String name,double salary) {
        super(id, name);
        this.salary=salary;
    }
    public double calculateAnnualSalary(){
        return salary*12;
    }
}

public class Example {
    public static void main(String[] args) {
        Employee1 emp=new Employee1(1,"Richards",5000);
        double annualSalary= emp.calculateAnnualSalary();
        System.out.println("Annual Salary of "+emp.name+":"+annualSalary);

    }
}
