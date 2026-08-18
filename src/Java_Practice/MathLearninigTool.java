package Java_Practice;
import java.util.Scanner;
public class MathLearninigTool {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter -1 to anytime to EXIT..");
        while(true){
            int N1 = (int)(Math.random()*10);
            int N2 = (int)(Math.random()*10);
            if(N1 < N2){
                int temp = N1;
                N1 = N2;
                N2 = temp;
            }
            System.out.println("What is "+N1 + " - "+N2+"?");
            int answer = sc.nextInt();
            if(answer == -1){
                System.out.println("You Exited from the GAME.. Thanks for playing!😊");
                break;
            }
            else if(N1 - N2 == answer){
                System.out.println("Correct answer");
            }else{
                System.out.println("Incorrect answer");
                System.out.println(N1 + " - "+ N2 + " is: " + (N1-N2));

            }
        }
        sc.close();
    }
}
