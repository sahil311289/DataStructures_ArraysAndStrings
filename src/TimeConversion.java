//Given a time in -hour AM/PM format, convert it to military (24-hour) time.
//
//        Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
//
//        Input Format
//
//        A single string  containing a time in -hour clock format (i.e.:  or ), where  and .
//
//        Output Format
//
//        Convert and print the given time in -hour format, where .
//
//        Sample Input
//
//        07:05:45PM
//        Sample Output
//
//        19:05:45

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {

    private static final Scanner scan = new Scanner(System.in);

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        if (s.indexOf("AM") != -1) {
            // AM
            int hours = Integer.parseInt(s.substring(0, 2));
            if (hours == 12) {
                return "00" + s.substring(2, s.length() - 2);
            } else {
                return s.substring(0, s.indexOf("AM"));
            }
        } else {
            // PM
            int hours = Integer.parseInt(s.substring(0, 2));

            if (hours == 12) {
                return s.substring(0, s.length() - 2);
            } else {
                return ((hours + 12) + s.substring(2, s.length() - 2));
            }
        }
    }

    public static void main(String[] args) {

        String s = scan.nextLine();

        String result = timeConversion(s);
        System.out.println(result);
    }
}

