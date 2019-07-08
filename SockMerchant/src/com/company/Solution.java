package com.company;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int numOfPairs = 0, count;
        ArrayList<Integer> sockCount = new ArrayList<>();
        ArrayList<Integer> sockNum = new ArrayList<>();

        boolean flag = false;
        for (int i = 0; i < (n - 1); i++) {
            count = 1;

            if (i > 0) {
                for (int k = 0; k < sockNum.size(); k++) {
                    if (ar[i] == sockNum.get(k)) {
                        flag = true;
                        break;
                    }
                }

                if (!flag) {
                    for (int j = i + 1; j < n; j++) {
                        if (ar[i] == ar[j])
                            count++;
                    }
                    sockCount.add(count);
                    sockNum.add(ar[i]);
                }
                flag = false;
            } else {
                for (int j = i + 1; j < n; j++) {
                    if (ar[i] == ar[j])
                        count++;
                }
                sockCount.add(count);
                sockNum.add(ar[i]);
            }

        }

        for (int a = 0; a < sockCount.size(); a++) {
            numOfPairs += sockCount.get(a) / 2;
        }

        return numOfPairs;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Enter number of socks : ");
        int n = scanner.nextInt();

        int[] ar = new int[n];

        System.out.println("Enter numbers describing the color of socks : ");

        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
        }

        int result = sockMerchant(n, ar);

        System.out.println("Matching pairs of socks : " + String.valueOf(result));
        scanner.close();
    }
}
