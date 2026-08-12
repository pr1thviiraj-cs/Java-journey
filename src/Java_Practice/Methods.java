package Java_Practice;
import java.util.Scanner;
public class Methods {
    public static void printjava(){
        System.out.println("Hello Prithviraj");
    }
    public static void printname(String name){
        System.out.println(name);
    }
    public static void printSum(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }
    public static void main(String[] args){
        printjava();
        printname("Prithviraj");
        printSum(5,8);
    }
}
