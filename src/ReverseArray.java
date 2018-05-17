// Reverse array without using temp variable
public class ReverseArray {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5, 6};
        int[] ar2 = {1, 2, 3, 4, 5, 6, 7};

        display(ar);

        for (int i = 0, j = ar.length - 1; i <= j; i++, j--) {
            ar[i] = ar[i] + ar[j];
            ar[j] = ar[i] - ar[j];
            ar[i] = ar[i] - ar[j];
        }

        display(ar);

        display(ar2);
        for (int i = 0, j = ar2.length - 1; i < j; i++, j--) {
            ar2[i] = ar2[i] + ar2[j];
            ar2[j] = ar2[i] - ar2[j];
            ar2[i] = ar2[i] - ar2[j];
        }
        display(ar2);
    }

    private static void display(int[] ar) {
        System.out.println();
        for (int i : ar) {
            System.out.print(i + " ");
        }
    }
}
