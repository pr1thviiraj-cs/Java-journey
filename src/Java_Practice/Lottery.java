package Java_Practice;
import java. util.Scanner;
public class Lottery {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int lottery = (int)(Math.random() * 90) + 10;

        System.out.print("Enter a two-digit number: ");
        int user = sc.nextInt();

        if (user < 10 || user > 99) {
            System.out.println("Invalid Input!");
            System.out.println("Please enter a TWO-DIGIT number.");
            sc.close();
            return;
        }

        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;

        int userDigit1 = user / 10;
        int userDigit2 = user % 10;

        System.out.println("Lottery Number = " + lottery);


        if (user == lottery) {
            System.out.println("🎉 Exact Match!");
            System.out.println("You won $10,000!");


        } else if (userDigit1 == lotteryDigit2 &&
                userDigit2 == lotteryDigit1) {

            System.out.println("🎉 Both digits match!");
            System.out.println("You won $3,000!");


        } else if (userDigit1 == lotteryDigit1 ||
                userDigit1 == lotteryDigit2 ||
                userDigit2 == lotteryDigit1 ||
                userDigit2 == lotteryDigit2) {

            System.out.println("🎉 One digit matches!");
            System.out.println("You won $1,000!");

        } else {
            System.out.println("No match.");
            System.out.println("You won $0.");
        }

        sc.close();
    }
}

