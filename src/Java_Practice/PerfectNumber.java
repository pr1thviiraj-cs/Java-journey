package Java_Practice;
public class PerfectNumber {
    public static void main(String[] args){
        System.out.println("Perfect Number between 1 to 10000 are: ");
        for(int number = 1; number < 9999; number++) {
            int sum = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            if (number == sum) {
                System.out.println(number);
            }
        }
    }
}
