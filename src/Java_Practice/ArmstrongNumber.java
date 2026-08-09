package Java_Practice;
import java.util.Scanner;
public class ArmstrongNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Digit: ");
        int n = sc.nextInt();
        int digit;
        int sum = 0;
        int original = n;
        int cube = 0;
        while(n > 0){
            digit = n % 10;
            n = n / 10;
            cube = digit * digit * digit;
            sum += cube;
        }
        System.out.println("Sum is = "+ sum);
        if(sum == original)
            System.out.println("It's a Armstrong Number");
        else
            System.out.println("It's Not a Armstrong Number");
        sc.close();
    }
}
