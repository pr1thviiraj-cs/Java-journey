package Java_Practice;
import java.util.Scanner;
public class DigitCounter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Digit to count: ");
        long digit = sc.nextLong();
        int count = 0;
        if(digit == 0) {
            count = 1;
        }
        while(digit > 0){
            digit = digit / 10;
            count++;
        }
        System.out.println("Total Count = "+count);
        sc.close();
    }
}
