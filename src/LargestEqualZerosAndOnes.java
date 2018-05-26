import java.util.*;

public class LargestEqualZerosAndOnes {
    static long startTime = 0;
    static long endTime = 0;

    public static void main(String[] args) {
        startTime = System.currentTimeMillis();
        endTime = 0;

        int[] ar = {1, 0, 1, 1, 1, 0, 0};
        printLargestEqualCounts(ar);

        endTime = System.currentTimeMillis();
        System.out.println("Execution time: " + (endTime - startTime) + " ms");
    }

    static void printLargestEqualCounts(int[] ar) {
        TreeMap<Integer, List<Integer>> counts = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < ar.length; i++) {

            // Reduce execution time by checking the largest size of counts stored so far.
            // if max size > (ar.length - i), break out of i loop.

            if (counts.size() > 0 && counts.firstEntry().getKey() > (ar.length - i)) {
                break;
            }

            Map<Integer, Integer> zerosAndOnes = new HashMap<>();
            for (int j = i; j < ar.length; j++) {
                if (zerosAndOnes.size() != 0 && zerosAndOnes.containsKey(ar[j])) {
                    int zeros = zerosAndOnes.get(ar[j]);
                    zerosAndOnes.put(ar[j], ++zeros);
                } else {
                    zerosAndOnes.put(ar[j], 1);
                }
                int zeroCount = 0;
                if (zerosAndOnes.containsKey(0)) {
                    zeroCount = zerosAndOnes.get(0);
                }
                int oneCount = 0;
                if (zerosAndOnes.containsKey(1)) {
                    oneCount = zerosAndOnes.get(1);
                }
                if (zeroCount == oneCount) {
                    int diff = j - i + 1;
                    List<Integer> indexes = null;
                    if (counts.containsKey(diff)) {
                        indexes = counts.get(diff);
                    } else {
                        indexes = new ArrayList<>();
                    }
                    indexes.add(i);
                    indexes.add(j);
                    counts.put(diff, indexes);
                }
            }
        }
        // Get the first element from treemap to get the index and size of largest 0s and 1s sequence
        Map.Entry<Integer, List<Integer>> tmap = counts.firstEntry();
        if (tmap != null) {
            System.out.println(tmap.getKey());
        } else {
            System.out.println("No such subarray");
            return;
        }
        int k = 0;
        while (k < tmap.getValue().size()) {
            System.out.print(tmap.getValue().get(k) + " to ");
            System.out.print(tmap.getValue().get(++k) + "\n");
            ++k;
        }
    }
}

/*
Given an array containing only 0s and 1s, find the largest subarray which contain equal no of 0s and 1s

Examples:
Input: arr[] = {1, 0, 1, 1, 1, 0, 0}
Output: 1 to 6 (Starting and Ending indexes of output subarray)

Input: arr[] = {1, 1, 1, 1}
Output: No such subarray

Input: arr[] = {0, 0, 1, 1, 0}
Output: 0 to 3 Or 1 to 4
 */