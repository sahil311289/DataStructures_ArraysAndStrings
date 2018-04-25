import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        System.out.println(areAnagrams(str1, str2));
    }

    public static final boolean areAnagrams(String str1, String str2) {

        str1 = str1.replaceAll("\\s+", "");
        str2 = str2.replaceAll("\\s+", "");
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charAr1 = str1.toCharArray();
        char[] charAr2 = str2.toCharArray();

        Arrays.sort(charAr1);
        Arrays.sort(charAr2);

        return new String(charAr1).equals(new String(charAr2));
    }
}
