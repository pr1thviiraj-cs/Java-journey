package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array Elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter the element to be searched: ");
        int target = sc.nextInt();
        int result = Arrays.binarySearch(arr, target);
        if (result >= 0){
            System.out.println("Element found at index " + result);
        }else {
            System.out.println("Element not found");
        }
        sc.close();
    }
}
