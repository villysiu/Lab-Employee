import java.util.Objects;
import java.util.Scanner;

class Employee {

    protected String firstName;
    protected String lastName;
    protected String title;
    protected double payRate;
    private String type;
    protected double hoursWorked;
    public Employee(){

    }

    public Employee(String firstName, String lastName, String title, double payRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.payRate = payRate;
    }
    public double calculateSalary(){
        return payRate * 40;
    }
    // Method for employee input
//Provide implementation to enter Employee data
    public void inputEmployee() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee type (salaried/hourly): ");
        this.setType(input.nextLine());

        System.out.println("Enter the first name: ");
        this.setFirstName(input.nextLine());
//        this.firstName = input.nextLine();

        System.out.println("Enter the last name: ");
        this.setLastName(input.nextLine());

        System.out.println("Enter the title: ");
        this.setTitle(input.nextLine());

        if (type.equals("salaried")) {
            System.out.println("Enter annual salary: ");
            this.setPayRate(input.nextDouble());
        }
        else{
            System.out.println("Enter hourly rate:");
            this.setPayRate(input.nextDouble());
            System.out.println("Enter hours worked:");
            this.setHoursWorked(input.nextInt());
        }
        input.close();

    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return "Employee [" +
                "firstName=" + firstName +
                ", lastName='" + lastName +
                ", title='" + title +
                ", payRate=" + payRate + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass())
            return false;
        Employee employee = (Employee) o;
        return Double.compare(payRate, employee.payRate) == 0 &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(title, employee.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, title, payRate);
    }
}


