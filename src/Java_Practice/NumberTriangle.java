         /*1. Write a Java program that accepts an integer n and prints a number triangle using nested loops. However:
                      • Print the square of the number if it is a perfect square.
                      • Print the cube of the number if it is divisible by 3.
                      • Skip the number if it is divisible by both 2 and 5, using continue.
                      • Stop the current row if the generated value exceeds 500, using break.
                      • Use Math.sqrt(), Math.pow(), and appropriate conditions.  */
package Java_Practice;
import java.util.Scanner;
public class NumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        int num = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
//                checking for divisibility by 2 & 5 if yess skip
                if(num % 2 == 0 || num % 5 == 0){
                    num++;
                    continue;
                }
                if(num > 500){
                    break;
                }
                int root = (int)Math.sqrt(num);
                if(root*root == num){
                    System.out.print(Math.pow(num,2)+" ");
                }else if(num % 3 == 0){
                    System.out.print(Math.pow(num,3)+" ");
                }else{
                    System.out.print(num+" ");
                }
                num++;
            }
            System.out.println();
            if(num > 500){
                break;
            }
        }
        sc.close();
    }
}
//Samajh nhi aya haii mujhe??? ..???