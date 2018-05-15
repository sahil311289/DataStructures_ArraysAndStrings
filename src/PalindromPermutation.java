import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Check if the given string is a palindrome permutation
public class PalindromPermutation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        input = input.replaceAll("\\s+", "").toLowerCase();

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : input.toCharArray()) {
            if (map.containsKey(ch)) {
                int count = map.get(ch);
                map.put(ch, ++count);
            } else {
                map.put(ch, 1);
            }
        }

        int oddCounts = 0;
        if (input.length() % 2 == 0) {
            // even length => all counts should be even
            for (char key : map.keySet()) {
                if (map.get(key) % 2 != 0) {
                    System.out.println("Not a palindrome permutation!");
                    return;
                }
            }
        } else {
            // odd length => at most one count should be odd
            for (char key : map.keySet()) {
                if (map.get(key) % 2 != 0) {
                    oddCounts++;
                    if (oddCounts > 1) {
                        return;
                    }
                }
            }
        }

        System.out.println("Palindrome permutation!");
    }
}
