import java.util.Scanner;

// Replace all spaces in a string with '%20'
public class URLify {
    public static void main(String[] args) {
        int spaces = 0;

        Scanner scan = new Scanner(System.in);
        String url = scan.nextLine();

        char[] urlAr = url.toCharArray();

        // First iteration: count spaces
        for (char ch : urlAr) {
            if (ch == ' ') {
                spaces++;
            }
        }

        // Total number of characters to be inserted is 3 per space,
        // So the new length = old length + 2 * spaces

        int newLength = url.length() + 2 * spaces;
        char[] newChAr = new char[newLength];

        int j = newLength - 1;
        // Second iteration: insert elements from right to left
        for (int i = url.length() - 1; i >= 0; ) {
            if (urlAr[i] != ' ') {
                newChAr[j] = urlAr[i];
                j--;
                i--;
            } else {
                newChAr[j] = '0';
                newChAr[j - 1] = '2';
                newChAr[j - 2] = '%';
                j -= 3;
                i--;
            }
        }

        System.out.println(new String(newChAr));
    }
}
