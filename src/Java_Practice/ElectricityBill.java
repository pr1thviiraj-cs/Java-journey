package Java_Practice;
import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Units Consumed: ");
        int units = sc.nextInt();
        double bill = 0;
        if(units < 50){
            bill = units * 0.50;
        }else if(units < 150){
            bill = (units * 0.50)+((units - 50)*0.75);
        }else if(units < 250){
            bill = (units * 0.50)+(units * 0.75)+((units - 150)*1.20);
        }else {
            bill = (units * 0.50)+(units * 0.75)+(units * 1.20)+((units - 250)*1.50);
        }
        double surcharge = bill * 0.20;
        double totalBill = surcharge + bill;
        System.out.println("Surcharge is = ₹"+surcharge);
        System.out.println("Total Bill is = ₹"+totalBill);
        sc.close();
    }

}
