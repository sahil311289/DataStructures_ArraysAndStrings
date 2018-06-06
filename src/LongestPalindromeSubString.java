import java.util.*;

// Find the longest palindrome substring in a string
public class LongestPalindromeSubString {
    public static void main(String[] args) {
        String str1 = "madamracecarmadam";
        String str2 = "madamracearmadam";
        longestPalindrome(str1);
    }

    static void longestPalindrome(String str) {
        Set<String> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = str.length() - 1 - i; j >= i; j--) {
                char[] ar = str.substring(i, j + 1).toCharArray();
                boolean palindrome = false;
                for (int k = i; k < ar.length / 2; k++) {
                    if (ar[k] != ar[ar.length - 1 - k]) {
                        palindrome = false;
                        break;
                    } else {
                        palindrome = true;
                    }
                }
                if (palindrome && new String(ar).length() > 1) {
                    set.add(new String(ar));
                    // To find the largest palindrome string
//                    if(new String(ar).length() == str.length()) {
//                        set.forEach(string -> {
//                            System.out.println(string);
//                        });
//                        return;
//                    }
                }
            }
        }

        System.out.println("\nPalindrome strings: ");
        set.forEach(string -> {
            System.out.println(string);
        });
    }
}
