package Java_Practice;
import java.util.Scanner;
public class Divisibility {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter a number to check divisibility");
        a = sc.nextInt();
        if(a%5==0 && a%11==0)
            System.out.println("Number is Divisible by both.");
        else
            System.out.println("Number is not divisible");
    }
}
