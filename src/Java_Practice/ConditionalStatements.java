package Java_Practice;
import java.util.Scanner;
public class ConditionalStatements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter your number to check: ");
        a = sc.nextInt();
        if(a%2==0)
            System.out.println("Number Entered is even.");
        else
            System.out.println("Number entered is Odd.");
    }
}
