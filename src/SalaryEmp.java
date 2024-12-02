import java.util.Scanner;

class SalaryEmp extends Employee {

    public SalaryEmp(String firstName, String lastName, String title, double payRate ) {
        super(firstName, lastName, title, payRate); // Call the parent constructor

    }

    @Override
    public double calculateSalary(){
        double res = payRate / 24;
        return (double)Math.round(res*100) / 100;
    }

//    display(): Output employee name, title, and bi-monthly salary.
    public void display(){
        System.out.println("Employee: "+ firstName + " " + lastName + ", Title: " + title);
        System.out.println("Bi-Monthly Salary: $" + calculateSalary());
    }

}
