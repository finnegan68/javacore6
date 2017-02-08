package myPractice.myEmployee;

/**
 * Created by Илья on 06.02.2017.
 */
public abstract class Employee {

    private static int nextId = 1;

    private String name;
    private int age;
    private double salary;
    private int id = nextId;


    public Employee(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
        nextId++;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getSalary(){
        return this.salary;
    }
    public int getId(){
        return this.id;
    }
    public void raiseSalary(double bonus){
        this.salary += bonus;
    }
    public String getDescription(){
        return "Id of employee : " + getId() + ". Name : " + getName() + ". Salary : " + getSalary();
    }
}
