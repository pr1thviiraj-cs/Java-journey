package Java_Practice;
import java.util.*;
public class EmiCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int LA, MP, YIR,Years;
        double MIR;
        System.out.print("Enter Loan Ammount: ");
        LA = sc.nextInt();
        System.out.println("Enter No. of Years: ");
        Years = sc.nextInt();
        System.out.println("Enter Interest rate: ");
        YIR = sc.nextInt();
        MIR = YIR / 1200.0;
        System.out.println("Your Monthly Intrest Rate is: "+MIR);

        MP = (int)(LA * MIR * Math.pow(1 + MIR, Years * 12)
                / (Math.pow(1 + MIR, Years * 12) - 1));
        double TP = MP*Years*12;
        System.out.println("Total Payment: "+TP);

        System.out.println("Your Monthly Payment is: "+MP);
    }
}