       /*(Display prime numbers between 2 and n) display all the prime numbers between 2 and n, inclusive.
                Display eight prime numbers per line. Numbers are seperated by exactly one space.*/
package Java_Practice;
import java.util.Scanner;
public class PrimeNumberGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Limit: ");
        int n = sc.nextInt();
        int count = 0;
        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;
            for(int i = 2; i < num; i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(num + " ");
                count++;
                if(count % 8 == 0){
                    System.out.println();
                }
            }
        }
    }
}
