package Java_Practice;
import java.util.Scanner;
public class TableGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. to print table of: ");
        int n = sc.nextInt();
        int i = 1;
        while(i <= 10) {
            System.out.println(n + " X " + i + " = " + n * i);
            i++;
        }
        sc.close();
      }
    }

