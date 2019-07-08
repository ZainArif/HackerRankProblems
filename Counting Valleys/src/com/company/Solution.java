package com.company;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int valleyStepCount = 0, numOfValleys = 0;
        int[] valleySteps = new int[n];
        char[] steps = s.toCharArray();
        boolean flag = false;

        for (int i = 0; i < n; i++) {
            if (steps[i] == 'D') {
                valleySteps[i] = --valleyStepCount;
            } else if (steps[i] == 'U') {
                valleySteps[i] = ++valleyStepCount;
            }
        }

        for (int k = 0; k < valleySteps.length; k++) {
            if (valleySteps[k] < 0) {
                for (int l = k + 1; l < valleySteps.length; l++) {
                    if (valleySteps[l] == 0) {
                        numOfValleys++;
                        k = l;
                        break;
                    }

                }
            }
        }

        return numOfValleys;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a string describing path : ");
        String s = scanner.nextLine();

        System.out.println("Enter number of steps : ");
        int n = scanner.nextInt();

        int result = countingValleys(n, s.toUpperCase());


        System.out.println("Result : " + String.valueOf(result));
    }
}

