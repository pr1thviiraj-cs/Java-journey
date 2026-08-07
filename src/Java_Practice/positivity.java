package Java_Practice;
import java.util.Scanner;
public class positivity {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter a number to check: ");
        a = sc.nextInt();
        if(a==0)
            System.out.println("The number Entered is Zero.");
        if(a>0)
            System.out.println("The number Entered is Positive.");
        if(a<0)
            System.out.println("Number is Negative.");
    }
}
