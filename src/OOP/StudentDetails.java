package OOP;
import java.util.Scanner;
class Student{
    int RollNo;
    String Name;
    int age;

    void display(){
    System.out.println("The Roll No is: " + RollNo);
        System.out.println("The Name is: " + Name);
        System.out.println("The Age is: " + age);
        System.out.println("-----------------------");
    }
}
public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student1 = new Student();

        System.out.print("Enter Roll Number of Student 1: ");
        student1.RollNo = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name of Student 1: ");
        student1.Name = sc.nextLine();

        System.out.print("Enter Age of Student 1: ");
        student1.age = sc.nextInt();

        Student student2 = new Student();

        System.out.println("Enter Roll Number of Student 2: ");
        student2.RollNo = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name of Student 2: ");
        student2.Name = sc.nextLine();

        System.out.print("Enter Age of Student 2: ");
        student2.age = sc.nextInt();

        System.out.println("\nStudent Details:- ");

        student1.display();
        student2.display();

        sc.close();

    }
}

/* 2.	Write a Java program to create a class named Students. Using objects of this class,
        store and display details of multiple students such as roll number, name, and age.
 */