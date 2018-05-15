import java.util.Arrays;
import java.util.Scanner;

// Given two string, write a method to decide if one is a permutation of the other
public class CheckPermutation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        str1 = str1.replaceAll("\\s+", "");
        str2 = str2.replaceAll("\\s+", "");

        if (str1.length() != str2.length()) {
            System.out.println("Not a permutation");
            return;
        }

        char[] chAr1 = str1.toCharArray();
        char[] chAr2 = str2.toCharArray();

        Arrays.sort(chAr1);
        Arrays.sort(chAr2);

        if (new String(chAr1).equals(new String(chAr2))) {
            System.out.println("Permutation !");
        } else {
            System.out.println("Not a permutation !");
        }
    }
}
