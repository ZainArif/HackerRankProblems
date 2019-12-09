package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of candles on the cake : ");
        int candles = scanner.nextInt();
        
        int[] heights = new int[candles];

        System.out.println("Enter the height of candles : ");
        for (int i=0;i<candles;i++){
            heights[i] = scanner.nextInt();
        }
        int result = birthdayCakeCandles(heights);

        System.out.println(result);
    }

    static int birthdayCakeCandles(int[] ar) {
        int count = 0;
        int length = ar.length - 1;

        Arrays.sort(ar);
        int largestNumber = ar[length];

        for (int i = length;i>=0;i--){
            if (largestNumber == ar[i])
                count++;
            else
                break;
        }
        return count;
    }
}
