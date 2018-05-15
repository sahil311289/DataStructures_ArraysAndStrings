import java.util.Scanner;

// 3 types of edits:
// insert: pal, pale => true
// remove: pale, pal => true
// replace: pale, bale => true
// Given 2 strings, write a function to check if they are one edit away

public class OneAway {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        if (str1.length() == str2.length()) {
            // Check for replcaement
            System.out.println(replace(str1, str2));
        } else if (str1.length() + 1 == str2.length()) {
            // str2 is bigger
            System.out.println(insert(str1, str2));
        } else if (str1.length() - 1 == str2.length()) {
            // str1 is bigger
            System.out.println(insert(str2, str1));
        } else {
            System.out.println(false);
        }
    }

    public static boolean replace(String str1, String str2) {
        boolean difference = false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                if (difference) {
                    return false;
                }
                difference = true;
            }
        }
        return true;
    }

    public static boolean insert(String smaller, String bigger) {
        int indexS = 0;
        int indexB = 0;

        while (indexS < smaller.length() && indexB < bigger.length()) {
            if (smaller.charAt(indexS) == bigger.charAt(indexB)) {
                indexS++;
                indexB++;
            } else {
                if (indexB != indexS) {
                    return false;
                }
                indexB++;
            }
        }
        return true;
    }
}
