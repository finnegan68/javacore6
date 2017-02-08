package myPractice.myEmployee;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Илья on 06.02.2017.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File ("D:\\JavaCore6\\src\\myPractice\\myEmployee\\myStaff"));
        Employee[] staff = new Employee[0];
        while(sc.hasNext()){
            String informationAboutPerson = sc.nextLine();
            String[] data = informationAboutPerson.split(" ");
            staff = Arrays.copyOf(staff, staff.length + 1);
            if (data[data.length - 1].equals("constantly")){
                staff[staff.length - 1] = new EmployeeConstantly(data[0],Integer.parseInt(data[1]), Double.parseDouble(data[2]));
            }else{
                staff[staff.length - 1] = new EmployeeHourly(data[0],Integer.parseInt(data[1]), Double.parseDouble(data[2]));
            }
        }

        sortBySalary(staff);
        for(Employee e : staff) {
            System.out.println("Name : " + e.getName() + ". Id : " + e.getId() + ". Salary : " + e.getSalary() + ".");
        }
    }


    public static void sortBySalary(Employee[] staff) {
        for (int i = 0; i < staff.length - 1; i++) {
            for (int j = i + 1; j < staff.length; j++) {
                if ((staff[i].getSalary() < staff[j].getSalary()) || (staff[i].getSalary() == staff[j].getSalary() && staff[i].getName().compareTo(staff[j].getName()) > 0)){
                    Employee tmp = staff[i];
                    staff[i] = staff[j];
                    staff[j] = tmp;
                }


            }
        }
    }
}

