package myPractice.myEmployee;


public class EmployeeConstantly extends Employee{

    public EmployeeConstantly(String name, int age, double salaryConst){
        super(name, age, salaryConst);
    }

    public double getSalary(){
        double salaryConst = super.getSalary();
        return salaryConst;
    }

}
