public class RangeSum {
    static int[][] ar = {{3, 0, 1, 4, 2}, {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}};

    public static void main(String[] args) {
        sumRegion(2, 1, 4, 3);
        update(3, 2, 2);
        sumRegion(2, 1, 4, 3);
    }

    static void sumRegion(int i1, int j1, int i2, int j2) {
        int sum = 0;
        for (int i = i1; i <= i2; i++) {
            for (int j = j1; j <= j2; j++) {
                sum += ar[i][j];
            }
        }
        System.out.println(sum);
    }

    static void update(int i, int j, int val) {
        ar[i][j] = val;
    }
}
