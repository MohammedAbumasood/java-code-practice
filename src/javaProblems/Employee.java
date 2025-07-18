package javaProblems;

import java.util.*;

class Employees{
    String name;
    int empId;
    double basicSalary;

    Employees(String name, int empId, double basicSalary){
        this.name = name;
        this.empId = empId;
        this.basicSalary = basicSalary;
    }

    void displayPaySlip(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+empId);
        System.out.println("BasicSalary: "+basicSalary);
        double HRA = (0.2*basicSalary);
        System.out.println("HRA: "+HRA);
        double DA = (0.1*basicSalary);
        System.out.println("DA: "+DA);
        System.out.println("Gross salary: "+(basicSalary+HRA+DA));
    }
}

public class Employee {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Id: ");
        int id = sc.nextInt();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Employees e1 = new Employees(name, id, salary);

        e1.displayPaySlip();
    }
}
