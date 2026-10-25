package Arrays;
import java.util.Scanner;
public class TransposeMatrix {
    static int[][] transpose(int[][] matrix) {
        int[][] trans = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                trans[i][j] = matrix[j][i];
            }
        }
        return trans;
    }
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matrix = new int[3][3];
        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[][]  trans = transpose(matrix);
        System.out.println("Matrix: ");
        printMatrix(matrix);
        System.out.println("Transpose: ");
        printMatrix(trans);
        sc.close();
    }
}
