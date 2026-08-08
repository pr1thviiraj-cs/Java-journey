package Java_Practice;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your digit: ");
        int n = sc.nextInt();
        int digit;
        int reverse = 0;
        while(n>0){
            digit = n % 10;
            n = n / 10;
            reverse = reverse*10 + digit;
        }
        System.out.println("Reversed Digit: " + reverse);
        sc.close();
    }
}
