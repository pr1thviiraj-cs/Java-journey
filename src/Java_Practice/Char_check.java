package Java_Practice;
import java.util.Scanner;
public class Char_check {
    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter Your Character");
        char ch = sc.next().charAt(0);
        if(ch >= 'A' && ch <= 'Z')
            System.out.println("Character is in Uppercase");
        else if(ch >= 'a' && ch <= 'z')
            System.out.println("Character is in Lowercase");
        else if(ch >= '0' && ch <= '9')
            System.out.println("It is a Digit");
        else
            System.out.println("It's a SPECIAL CHARACTER");
    }
}
