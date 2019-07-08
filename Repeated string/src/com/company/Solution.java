package com.company;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long count = 0, length = s.length();
        long repOfString = n / length;
        long remChars = n % length;
        int ind = 0;
        StringBuilder str = new StringBuilder(s);

        if (length == 1 && s.equals('a'))
            count = repOfString;
        else {

            for (long j = 1; j <= length; j++) {
                if (str.charAt(ind++) == 'a')
                    count++;
            }
            count *= repOfString;

            if (remChars > 0) {
                for (int k = 0; k < remChars; k++) {
                    if (str.charAt(k) == 'a')
                        count++;
                }
            }
        }

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        System.out.println("Enter a string to repeat : ");
        String s = scanner.nextLine();

        System.out.println("Enter a number of characters to consider : ");
        long n = scanner.nextLong();

        long result = repeatedString(s, n);

        System.out.println(result);
        scanner.close();
    }
}

