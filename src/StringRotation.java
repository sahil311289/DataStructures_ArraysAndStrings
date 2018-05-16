import java.util.Scanner;

// check if a given string is a substring of another string
public class StringRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        if ((str1 + str1).indexOf(str2) != -1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
