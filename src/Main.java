public class Main {
    public static void main(String[] args) {

        Employee empObj = new Employee();
        empObj.inputEmployee();

        String type = empObj.getType();
        String firstName = empObj.getFirstName();
        String lastName = empObj.getLastName();
        String title = empObj.getTitle();
        double payRate = empObj.getPayRate();
        double hoursWorked = empObj.getHoursWorked();

        SalaryEmp salEmpObj;
        HourlyEmp hourEmpObj;

        if(type.equals("salaried")) {

            salEmpObj = new SalaryEmp(firstName, lastName, title, payRate);
            salEmpObj.display();
        }
        else  {
            hourEmpObj = new HourlyEmp(firstName, lastName, title, payRate, hoursWorked);
            hourEmpObj.display();
        }

//        Employee [] empArr = {empObj1, empObj2};
//        for(Employee emp : empArr) {
//            System.out.println(emp.toString());
//            System.out.println("The salary is " + emp.calculateSalary());
//            System.out.println("The hashcode for " + emp.getFirstName() + " is " + emp.hashCode());
//        }
//        //Add a duplicate empployee to test equal
//                Employee dupObj = new Employee("John", "Doe", "Software Engineer", 50);
//        System.out.println("Compare empObj1 with a duplicated empObj by equals method");
//        System.out.println("it should return true since it is comparing content.");
//
//        System.out.println(empObj1.equals(dupObj));
//
//        System.out.println("Compare empObj1 with a duplicated empObj by '=='");
//        System.out.println("it should return false since it is pointing at memory location.");
//        System.out.println(empObj1 == dupObj);
//
//
//        System.out.println("The hashcode for the duplicated empObj " + dupObj.getFirstName() + " is " + dupObj.hashCode());
//        System.out.println("which is same as Johns");
//        System.out.println("empObj1.hashCode() == dupObj.hashCode() returns " + (empObj1.hashCode() == dupObj.hashCode()));

    }
}