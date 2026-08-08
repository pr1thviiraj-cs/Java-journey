package Java_Practice;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. to check Prime: ");
        int n = sc.nextInt();
        int i;
        if(n <= 1){
            System.out.println("Not a Prime Number");
            sc.close();
            return;
        }
        boolean isPrime = true;
        for(i = 2; i < n; i++) {
            if(n % i == 0)
                isPrime = false;
                break;
        }
        if(isPrime)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
        sc.close();
    }
}
