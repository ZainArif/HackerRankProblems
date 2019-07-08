package com.company;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int length = c.length, numOfJumps = 0;
        for (int i=0;i<length;i++){
            //System.out.println("i = " + i);
            if (c[i]==0){
                if ( ((i+1)<length) && c[i+1]==0 ){
                    if ( ((i+2)<length) && c[i+2]==0 ){
                        numOfJumps++;
                        i++;
                    }
                    else {
                        numOfJumps++;
                    }
                }
                else if (((i+1)<length) && c[i+1]==1){
                    numOfJumps++;
                    i++;
                }
            }
        }
        return numOfJumps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        System.out.println("Enter number of clouds : ");
        int n = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        //String[] cItems = scanner.nextLine().split(" ");
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println("Enter binary integers describing clouds : ");

        for (int i = 0; i < n; i++) {
            //int cItem = Integer.parseInt(cItems[i]);
            c[i] = scanner.nextInt();
        }

        int result = jumpingOnClouds(c);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        System.out.println("Minimum number of jumps needed to win the game : " + result);
        scanner.close();
    }
}
