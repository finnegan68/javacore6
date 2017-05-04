package myPractice.myEmployee;


public class EmployeeHourly extends Employee{

    public EmployeeHourly(String name, int age, double salaryPerHour){
        super(name, age, salaryPerHour);
    }

    public double getSalary(){
        return 20.8 * 8 * super.getSalary();
    }
}
