package Java_Practice;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Digit: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c;
        if(n<=0) {
            System.out.println("Please enter a positive number.");
            sc.close();
            return;
        }
        if(n == 1){
            System.out.println(a);
            sc.close();
            return;
        }
        System.out.print(a+" "+b);
        for(int i = 0; i<n-2; i++){
            c = a + b;
            System.out.print(" "+c);
            a = b;
            b = c;
        }
        sc.close();
    }
}
