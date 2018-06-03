public class StringOutputs {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1;
        String str3 = new String("hello");
        char[] ar = {'h', 'e', 'l', 'l', 'o'};
        String str4 = ar.toString();
        String str5 = new String(ar);
        String str6 = new String();
        String str7;

        // ==
        System.out.println("==");
        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str1 == str4); // false
        System.out.println(str1 == str5); // false
        str6 = str1;
        System.out.println(str1 == str6); // true
        str7 = str1;
        System.out.println(str7 == str1); // true

        System.out.println();

        System.out.println(str2 == str3); // false
        System.out.println(str2 == str4); // false
        System.out.println(str2 == str5); // false
        str6 = str2;
        System.out.println(str2 == str6); // true
        str7 = str2;
        System.out.println(str7 == str2); // true

        System.out.println();

        System.out.println(str3 == str4); // false
        System.out.println(str3 == str5); // false
        str6 = str3;
        System.out.println(str3 == str6); // true
        str7 = str3;
        System.out.println(str7 == str3); // true

        System.out.println();

        System.out.println(str4 == str5); // false
        str6 = str4;
        System.out.println(str4 == str6); // true
        str7 = str4;
        System.out.println(str7 == str4); // true

        System.out.println();

        str6 = str5;
        System.out.println(str5 == str6); // true
        str7 = str5;
        System.out.println(str7 == str5); // true

        System.out.println();

        str7 = str6;
        System.out.println(str7 == str6); // true

        // .equals
        System.out.println("\n.equals");
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // true
        System.out.println(str1.equals(str4)); // false
        System.out.println(str1.equals(str5)); // true
        str6 = str1;
        System.out.println(str1.equals(str6)); // true
        str7 = str1;
        System.out.println(str1.equals(str7)); // true

        System.out.println();

        System.out.println(str2.equals(str3)); // true
        System.out.println(str2.equals(str4)); // false
        System.out.println(str2.equals(str5)); // true
        str6 = str2;
        System.out.println(str2.equals(str6)); // true
        str7 = str2;
        System.out.println(str2.equals(str7)); // true

        System.out.println();

        System.out.println(str3.equals(str4)); // false
        System.out.println(str3.equals(str5)); // true
        str6 = str3;
        System.out.println(str3.equals(str6)); // true
        str7 = str3;
        System.out.println(str3.equals(str7)); // true

        System.out.println();

        System.out.println(str4.equals(str5)); // false
        str6 = str4;
        System.out.println(str4.equals(str6)); // true
        str7 = str4;
        System.out.println(str4.equals(str7)); // true

        System.out.println();

        str6 = str5;
        System.out.println(str5.equals(str6)); // true
        str7 = str5;
        System.out.println(str5.equals(str7)); // true

        System.out.println();

        str6 = str7;
        System.out.println(str6.equals(str7)); // true

        System.out.println();

        String str8 = new String();
        System.out.println(str8);   // ""
        String str9 = str8;
        System.out.println(str9 == str8); // true
        System.out.println(str9.equals(str8)); // true

        System.out.println();

        String str10 = new String(ar);
        System.out.println(str10 == str5); // false
        System.out.println(str10.equals(str5)); // true

        System.out.println();

        // If text is same, == and .quals are both true.
        String str11 = "hello";
        System.out.println(str1 == str11); // true
        System.out.println(str1.equals(str11)); // true
    }
}
