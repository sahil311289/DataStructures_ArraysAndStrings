import java.util.Scanner;

// If an element in a matrix is zero, its entire row and column are zero
public class ZeroMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        int[][] ar = new int[rows][cols];

        int row = -1;
        int col = -1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ar[i][j] = scan.nextInt();
                System.out.print(ar[i][j] + " ");
                if (ar[i][j] == 0) {
                    row = i;
                    col = j;
                }
            }
            System.out.println();
        }

        if (row != -1 && col != -1) {
            for (int k = 0; k < rows; k++) {
                ar[k][col] = 0;
            }
            for (int m = 0; m < cols; m++) {
                ar[row][m] = 0;
            }
        }

        System.out.println();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }
}
