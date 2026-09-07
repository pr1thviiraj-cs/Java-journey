package OOP;
import java.util.Scanner;
public class GCDPrograme {
    static int findGCD(int a, int b){
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int N1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int N2 = input.nextInt();
        int gcd =  findGCD(N1, N2);
        System.out.println("The Greatest Common Divisor is " + gcd);
    }
}


/* 1.	 Develop a Java program takes two integers from the user and
         prints their greatest common divisor (GCD) using a method.*/
