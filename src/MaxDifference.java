public class MaxDifference {
    public static void main(String[] args) {
        int[] ar3 = {4, 1, 2, 3};
        int[] ar = {5, 10, 7, 6, 4, 3, 1};
        maxDiff(ar);
    }

    static void maxDiff(int[] ar) {
        int[] ar2 = new int[ar.length];

        for (int i = 0; i < ar.length; i++) {

            int maxDiff = -1;

            for (int j = 0; j < i; j++) {
                if (i > j && ar[i] > ar[j] && maxDiff < ar[i] - ar[j]) {
                    maxDiff = ar[i] - ar[j];
                }
            }
            ar2[i] = maxDiff;
        }

        for (int i : ar2) {
            System.out.print(i + " ");
        }
    }
}
