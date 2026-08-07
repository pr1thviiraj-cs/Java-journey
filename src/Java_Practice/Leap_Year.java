package Java_Practice;
import java.util.Scanner;
public class Leap_Year {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter your Year");
        year = sc.nextInt();
        if(year % 4 == 0 && year % 100 != 0)
            System.out.println("Entered Year is a LEAP YEAR.");
        else if(year % 400 == 0)
            System.out.println("LEAP YEAR");
        else
            System.out.println("Not a LEAP YEAR");
    }
}
