//Madhya Pradesh Vehicle Number plate Generator.....
package Java_Practice;
import org.w3c.dom.ls.LSOutput;
import java.util.Random;
public class VehicleNumberPlate {
    public static void main(String[] args) {
        Random plate = new Random();
        char L1 = (char) ('A' + plate.nextInt(26));
        char L2 = (char) ('A' + plate.nextInt(26));
        int digits = 1000 + plate.nextInt(9000);
        System.out.println("MP14"+L1+L2+digits);
    }
}
