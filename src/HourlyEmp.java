import java.util.Scanner;

public class HourlyEmp extends Employee {
    double hoursWorked;
    public HourlyEmp(String firstName, String lastName, String title, double payRate, double hoursWorked) {
        super(firstName, lastName, title, payRate);
        this.hoursWorked = hoursWorked;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary(){
        return payRate * hoursWorked;
    }

    public void display(){
        System.out.println("Employee: "+ firstName + " " + lastName + ", Title: " + title);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Weekly Pay: $" + calculateSalary());
    }

}
