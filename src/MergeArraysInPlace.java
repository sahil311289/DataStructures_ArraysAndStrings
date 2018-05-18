import java.util.Arrays;

public class MergeArraysInPlace {
    public static void main(String[] args) {
        int[] a = {20, 34, 78, 128};
        int[] b = {12, 32, 66, 300, 498, 0, 0, 0, 0};

        print(a);
        print(b);
        merge(a, b);
        print(b);
    }

    private static void merge(int[] a, int[] b) {
        int index1 = 0;
        int index2 = 0;

        while (index1 < a.length && index2 < b.length) {
            if (a[index1] < b[index2]) {
                // Move all the elements in array b to the right
                for (int i = b.length - 2; i >= index2; i--) {
                    b[i + 1] = b[i];
                }
                b[index2] = a[index1];
                index1++;
                index2++;
            } else {
                index2++;
            }
        }
    }

    private static void print(int[] ar) {
        System.out.println();
        for (int v : ar) {
            System.out.print(v + " ");
        }
    }
}
