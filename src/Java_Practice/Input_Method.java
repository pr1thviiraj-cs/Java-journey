package Java_Practice;
import java.util.*;
public class Input_Method{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Enetr Your Name: ");
        name = sc.nextLine();
        System.out.println("Your Name is: "+name);

//        Taking input of two Numbers and printing their sum..

        int a;
        System.out.println("Enter Your Frist Number: ");
        a = sc.nextInt();
        int b;
        System.out.println("Enter Your Second Number: ");
        b = sc.nextInt();
        int sum = a + b;
        System.out.println("The Sum of Both the numbers is: "+sum);

    }
}
