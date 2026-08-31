package Java_Practice;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        int n = sc.nextInt();
        int frist = 0;
        int second = 1;
        System.out.println("Fibonacci series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(frist + " ");
            int next =  frist + second;
            frist = second;
            second = next;
        }
        sc.close();
    }
}
