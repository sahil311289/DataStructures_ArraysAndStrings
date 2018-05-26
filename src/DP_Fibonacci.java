/*
In order to qualify for DP, a problem must have
    1. Overlapping sub-problems property
    2. Optimal substructure

2 ways to store results:
    1. Memoization (top down)
    2. Tabulation (bottom up)
*/

public class DP_Fibonacci {
    static long startTime1, endTime1;
    static int[] vals = new int[200];
    static int[] vals2 = new int[200];

    public static void main(String[] args) {
        startTime1 = System.currentTimeMillis();
        System.out.println(fib(20));
        endTime1 = System.currentTimeMillis();
        System.out.println(endTime1 - startTime1 + " ms");

        for (int i = 0; i < vals.length; i++) {
            vals[i] = -1;
        }

        // Memoization: Top down
        startTime1 = System.currentTimeMillis();
        System.out.println(fib2(190));
        endTime1 = System.currentTimeMillis();
        System.out.println(endTime1 - startTime1 + " ms");

        // Tabulation: Bottom up
        startTime1 = System.currentTimeMillis();
        System.out.println(fib3(190));
        endTime1 = System.currentTimeMillis();
        System.out.println(endTime1 - startTime1 + " ms");
    }

    static long fib(long n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    // top down
    static int fib2(int n) {
        if (vals[n] == -1) {
            if (n <= 1) {
                vals[n] = n;
            } else {
                vals[n] = fib2(n - 1) + fib2(n - 2);
            }
        }
        return vals[n];
    }

    // bottom up
    static int fib3(int n) {
        vals[0] = 0;
        vals[1] = 1;
        for (int i = 2; i < n; i++) {
            vals[i] = vals[i - 1] + vals[i - 2];
        }
        return vals[n];
    }
}
