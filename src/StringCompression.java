import java.util.Scanner;

// Compress string : cccaabbbbdd => c3a2b4d2
public class StringCompression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                sb.append(input.charAt(i - 1));
                sb.append(count);
                count = 1;
            }
        }

        sb.append(input.charAt(input.length() - 1)).append(count);

        System.out.println(sb.toString());
    }
}
