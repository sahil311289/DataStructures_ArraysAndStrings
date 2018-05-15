import java.util.Scanner;

// Determine if a string has all unique characters
public class IsUnique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.replaceAll("//s+", "");
        // Check if the length of the string is more than 26 characters.
        // If yes, characters are not unique.
        if (input.length() > 128) {
            System.out.println("Not unique");
            return;
        }

        boolean[] bAr = new boolean[128];
        char[] cAr = input.toCharArray();

        for (char ch : cAr) {
            int num = ch;
            if (bAr[num]) {
                System.out.println("Not unique");
                return;
            }
            bAr[num] = true;
        }
        System.out.println("Unique");
    }
}
