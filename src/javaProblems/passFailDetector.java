package javaProblems;
import java.util.*;

class Student{
    String name;
    int mark;

    Student(String name, int mark){
        this.name = name;
        this.mark = mark;
    }

    String getResult(){
        return (mark >= 50) ? "pass" : "fail";
    }

    void printDetail(){
        System.out.println("n/---Result---");
        System.out.println("Name: "+name);
        System.out.println("Mark: "+mark);
        System.out.println("Result: "+ getResult());
    }
}

public class passFailDetector {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name");
        String name = sc.nextLine();

        System.out.println("Enter Mark");
        int mark = sc.nextInt();

        Student result = new Student("Masood", 89);

        result.printDetail();

        sc.close();
    }
}
