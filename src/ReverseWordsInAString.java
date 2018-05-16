import java.util.Scanner;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        String[] strAr = input.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strAr.length - 1; i >= 0; i--) {
            if (i == strAr.length - 1) {
                sb.append(strAr[i]);
            } else {
                sb.append(" ").append(strAr[i]);
            }
        }
        System.out.println(sb.toString());
    }
}
