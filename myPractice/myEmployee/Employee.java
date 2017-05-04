package myPractice.myEmployee;


public abstract class Employee implements Comparable<Employee>{

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
    public int compareTo(Employee someEmployee) {
        int result = Double.compare(getSalary(),someEmployee.getSalary());
        if (result == 0){
            return name.compareTo(someEmployee.getName());
    }
        return result;
    }
}
