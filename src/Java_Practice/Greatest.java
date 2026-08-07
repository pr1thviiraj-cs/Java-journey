package Java_Practice;
import java.util.Scanner;
public class Greatest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter 1st No.: ");
        a = sc.nextInt();
        int b;
        System.out.println("Enter 2nd No.: ");
        b = sc.nextInt();
        int c;
        System.out.println("Enter 3rd No.: ");
        c = sc.nextInt();

        if(a>b && a>c)
            System.out.println("A is greater");
        else if(b>a && b>c)
            System.out.println("B is Greater");
        else
            System.out.println("C is Greater");
    }
}
