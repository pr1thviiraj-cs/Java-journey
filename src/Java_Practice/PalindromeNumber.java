package Java_Practice;
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. to check Palindrome: ");
        int n = sc.nextInt();
        int digit;
        int reverse = 0;
        int original = n;
        while(n>0){
            digit = n % 10;
            n = n / 10;
            reverse = reverse*10 + digit;
        }
        System.out.println("Reverse is: "+reverse);
        if(original == reverse)
            System.out.println("It is a Palindrome Number.");
        else
            System.out.println("It is not a Palindrome Number.");
        sc.close();
    }
}
