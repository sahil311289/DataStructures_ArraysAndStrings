import java.io.BufferedWriter;
import java.io.IOException;
import java.util.*;

public class MaxDifference {
//    public static void main(String[] args) {
//        int[] ar3 = {4, 1, 2, 3};
//        int[] ar = {5, 10, 7, 6, 4, 3, 1};
//        maxDiff(ar);
//    }

//    static void maxDiff(int[] ar) {
//        int[] ar2 = new int[ar.length];
//
//        for (int i = 0; i < ar.length; i++) {
//
//            int maxDiff = -1;
//
//            for (int j = 0; j < i; j++) {
//                if (i > j && ar[i] > ar[j] && maxDiff < ar[i] - ar[j]) {
//                    maxDiff = ar[i] - ar[j];
//                }
//            }
//            ar2[i] = maxDiff;
//        }
//
//        for (int i : ar2) {
//            System.out.print(i + " ");
//        }
//    }

    private static final Scanner scanner = new Scanner(System.in);

    static int maxDifference(int[] a) {
        int maxDiff = Integer.MIN_VALUE;
        if (a.length > 0) {

            Map<Integer, Integer> bMap = new TreeMap<>(Collections.reverseOrder());
            Map<Integer, Integer> cMap = new TreeMap<>();

            for (int i = 0; i < a.length; i++) {
                bMap.put(a[i], i);
                cMap.put(a[i], i);
            }

            for (int maxKey : bMap.keySet()) {
                int maxValue = bMap.get(maxKey);
                for (int minKey : cMap.keySet()) {
                    int minValue = cMap.get(minKey);
                    if (maxValue > minValue && maxKey > minKey) {
                        maxDiff = maxKey - minKey;
                        break;
                    }
                }
                if (maxDiff != Integer.MIN_VALUE) {
                    break;
                }
            }

        }
        return maxDiff == Integer.MIN_VALUE ? -1 : maxDiff;
    }

    public static void main(String[] args) {

        int aCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[aCount];

        for (int i = 0; i < aCount; i++) {
            int aItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            a[i] = aItem;
        }

        int res = maxDifference(a);
        System.out.println("Ouput: " + res);

    }
}
