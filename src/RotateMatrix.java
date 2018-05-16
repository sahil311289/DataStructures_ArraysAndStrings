import java.util.Scanner;

// Rotate a matrix clockwise and anticlockwise
public class RotateMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] ar = {{1, 2}, {4, 5}, {7, 8}};
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Left rotation");
        int[][] ar2 = new int[ar[0].length][ar.length];

        for (int i = 0; i < ar[0].length; i++) {
            for (int j = 0; j < ar.length; j++) {
                ar2[i][j] = ar[j][ar[0].length - 1 - i];
            }
        }

        for (int i = 0; i < ar2.length; i++) {
            for (int j = 0; j < ar2[0].length; j++) {
                System.out.print(ar2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Right rotation");
        int[][] ar3 = new int[ar[0].length][ar.length];

        for (int i = 0; i < ar[0].length; i++) {
            for (int j = 0; j < ar.length; j++) {
                ar3[i][j] = ar[ar[0].length - j][i];
            }
        }

        for (int i = 0; i < ar3.length; i++) {
            for (int j = 0; j < ar3[0].length; j++) {
                System.out.print(ar3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
