// package Constructors;
import java.util.*;
class Student
{
    String name;
    int rollno;
    double gpa;
    boolean gender; // true for male false for female
    Student(String name, int rollno)
    {
        this.name = name;
        this.rollno = rollno;
    }
    Student(String name, int rollno, double gpa,boolean gender) // This is called as 
    //Constructor overloading 
    {
        this.name = name;
        this.rollno = rollno;
        this.gpa = gpa;
        this.gender = gender;
    }
    void isit(double gpa, boolean gender)
    {
        if(gpa>5.0 || gender==true)
        {
            System.out.println("Yes the fact is true");
        }
        else System.out.println("No the face is false");
    }
}
public class ConstructorBasics {
    public static void main(String[] args) {
        Student stu1 = new Student("Hemang",21);
        Student stu2  = new Student("Khyati",23,9.42,true);
        System.out.println(stu1.gpa);
        stu1.isit(stu1.gpa,stu1.gender);
        System.out.println(stu2.gpa);
        stu2.isit(stu2.gpa,stu2.gender);
    }
}
