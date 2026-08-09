package Java_Practice;
import java.util.Scanner;
public class SumofDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Digit: ");
        int n = sc.nextInt();
        int sum = 0;
        int digit;
        while(n>0){
            digit = n % 10;
            n = n / 10;
            sum += digit;
        }
        System.out.println("Sum of digits is = "+ sum);
        sc.close();
    }
}
