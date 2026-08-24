package Java_Practice;
import java.util.Scanner;
public class SimpleCalc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1'st Number: ");
        int N1 = sc.nextInt();
        System.out.println("Enter 2'nd Number: ");
        int N2 = sc.nextInt();
        System.out.println("Enter Operator (+,-,*,/,%)");
        char Operator = sc.next().charAt(0);
        int result = 0;
        switch(Operator){
            case '+':
                result = N1 + N2;
                System.out.println("Sum is = "+result);
                break;
            case '-':
                result = N1 - N2;
                System.out.println("Diffrence is = "+result);
                break;
            case '*':
                result = N1 * N2;
                System.out.println("Product is = "+result);
                break;
            case '/':
                if(N2 == 0){
                    System.out.println("Cannot Divide with zero!");
                }else{
                    result = N1 / N2;
                    System.out.println("Division is = "+result);
                }
                break;
            case '%':
                result = N1 % N2;
                System.out.println("Remainder is = "+result);
                break;
            default:
                System.out.println("Invalid input!");
        }
        sc.close();
    }
}
