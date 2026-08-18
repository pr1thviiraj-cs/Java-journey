package Java_Practice;
import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your weight: ");
        double Weight = sc.nextDouble();
        System.out.println("Enter your Height in ft: ");
        double Height = sc.nextDouble();
        Height = Height * 0.3048;
        double BMI = Weight/Math.pow(Height,2);

        if(BMI < 16){
            System.out.println("Seriously Underweight.");
        }else if(BMI >= 16 && BMI < 18){
            System.out.println("Underweight.");
        }else if(BMI >= 18 && BMI < 24){
            System.out.println("Normal Weight.");
        }else if(BMI >= 24 && BMI < 29){
            System.out.println("Overweight.");
        }else if(BMI >= 29 && BMI < 35){
            System.out.println("Seriously Overweight.");
        }else{
            System.out.println("Gravely Overweight.");
        }
        System.out.println("Your BMI is: "+BMI);
        sc.close();
    }
}
