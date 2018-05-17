import java.util.Scanner;

public class MinimumNumberOfCoins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] coins = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        int money = scan.nextInt();

        int counter = 0;
        while (money != 0) {
            for (int i = coins.length - 1; i >= 0; i--) {
                if (coins[i] <= money) {
                    money -= coins[i];
                    counter++;
                    if (money == 0) {
                        break;
                    }
                    break;
                }
            }
        }
        System.out.println(counter);
    }
}
