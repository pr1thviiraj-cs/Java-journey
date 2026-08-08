package Java_Practice;
import java.util.Scanner;
public class StudentResult {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int maths, english, physics, chemistry, computer;
        double percentage;
        int total;
        System.out.println("Enter Maths Marks: ");
        maths = sc.nextInt();
        System.out.println("Enter English Marks: ");
        english = sc.nextInt();
        System.out.println("Enter Physics Marks: ");
        physics = sc.nextInt();
        System.out.println("Enter Chemistry Marks: ");
        chemistry = sc.nextInt();
        System.out.println("Enter Computer Marks: ");
        computer = sc.nextInt();

        total = maths + english + chemistry + physics + computer;
        percentage = (double)total / 500 * 100;

        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage);

        if(percentage >= 33)
            System.out.println("Result = PASS");
        else
            System.out.println("Result = FAIL");
        sc.close();
    }
}
