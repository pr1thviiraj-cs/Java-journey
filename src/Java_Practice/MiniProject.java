package Java_Practice;
import java.sql.SQLOutput;
import java.util.*;
public class MiniProject {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int MyNumber = (int)(Math.random()*100);
        int yourNumber = 0;
        do{
            System.out.println("GUESS MY NUMBER: ");
            yourNumber = sc.nextInt();

            if(yourNumber == MyNumber){
                System.out.println("WOOHOOO... CORRECT GUESS!!");
                break;
            } else if (MyNumber > yourNumber) {
                System.out.println("Your Number is Small.");
            }else{
                System.out.println("Your Number is Large.");
            }
        }while(yourNumber >= 0);
        System.out.println("My Number was: " + MyNumber);
    }
}
