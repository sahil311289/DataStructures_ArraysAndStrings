import java.util.*;

public class MinPrice {
    private static final Scanner scanner = new Scanner(System.in);

    static void finalPrice(int[] prices) {
        List<Integer> unAltered = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] < min && prices[j] <= prices[i]) {
                    min = prices[j];
                    break;
                }
            }
            if (min == Integer.MAX_VALUE) {
                unAltered.add(i);
                sum += prices[i];
            } else {
                sum += prices[i] - min;
            }
        }
        sum += prices[prices.length - 1];
        unAltered.add(prices.length - 1);
        System.out.print(sum + "\n");
        unAltered.forEach(v -> {
            System.out.print(v + " ");
        });
    }

    public static void main(String[] args) {
        int pricesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] prices = new int[pricesCount];

        for (int i = 0; i < pricesCount; i++) {
            int pricesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            prices[i] = pricesItem;
        }

        finalPrice(prices);

        scanner.close();
    }
}

/*
input:

5
1
3
3
2
5

 */
