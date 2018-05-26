/*
In order to qualify for DP, a problem must have
    1. Overlapping sub-problems property
    2. Optimal substructure

2 ways to store results:
    1. Memoization (top down)
    2. Tabulation (bottom up)
*/

public class DP_Fibonacci {
    static long startTime1, startTime2, endTime1, endTime2;
    static long[] vals = new long[200];

    public static void main(String[] args) {
        startTime1 = System.currentTimeMillis();
        System.out.println(fib(20));
        endTime1 = System.currentTimeMillis();
        System.out.println(endTime1 - startTime1 + " ms");

        for (int i = 0; i < vals.length; i++) {
            vals[i] = -1;
        }

        startTime2 = System.currentTimeMillis();
        System.out.println(fib2(190));
        endTime2 = System.currentTimeMillis();
        System.out.println(endTime2 - startTime2 + " ms");
    }

    static long fib(long n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    static long fib2(long n) {
        if (vals[(int) n] == -1) {
            if (n <= 1) {
                vals[(int) n] = n;
            } else {
                vals[(int) n] = fib2(n - 1) + fib2(n - 2);
            }
        }
        return vals[(int) n];
    }
}
