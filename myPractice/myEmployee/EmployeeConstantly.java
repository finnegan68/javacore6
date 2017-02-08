package myPractice.myEmployee;

/**
 * Created by Илья on 06.02.2017.
 */
public class EmployeeConstantly extends Employee{

    public EmployeeConstantly(String name, int age, double salaryConst){
        super(name, age, salaryConst);
    }
    public double getSalary(){
        double salaryConst = super.getSalary();
        return salaryConst;
    }
}
