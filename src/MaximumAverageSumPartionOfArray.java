import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaximumAverageSumPartionOfArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int k = scan.nextInt();
        String[] ar = input.split(" ");

        List<Integer> list = new ArrayList<>();
        for (String str : ar) {
            list.add(Integer.parseInt(str.replaceAll("\\s+", "")));
        }

        Collections.sort(list, Collections.reverseOrder());
        int sum = 0;
        for (int j = 0; j < k - 1; j++) {
            sum += list.get(j);
        }

        int sum2 = 0;
        for (int j = k - 1; j < list.size(); j++) {
            sum2 += list.get(j);
        }
        System.out.println("Sum is: " + sum + (double) sum2 / k);

    }
}
