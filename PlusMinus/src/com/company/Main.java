package com.company;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a size of array: ");
        int size = scanner.nextInt();

        System.out.println("Enter numbers of the array: ");
        int[] arr = new int[size];
        for (int i=0;i<size;i++)
            arr[i] = scanner.nextInt();

        plusMinus(arr);
    }

    static void plusMinus(int[] arr) {
        float length = arr.length;

        int neg_no = 0,pos_no = 0,zeros = 0;

        for (int i=0;i<length;i++){
            if (arr[i]<0)
                neg_no++;
            else if (arr[i]==0)
                zeros++;
            else
                pos_no++;
        }

        float neg_ratio = (neg_no/length);
        float pos_ratio = (pos_no/length);
        float zeros_ratio = (zeros/length);

        DecimalFormat df = new DecimalFormat("0.000000");

        System.out.println(df.format(pos_ratio));
        System.out.println(df.format(neg_ratio));
        System.out.println(df.format(zeros_ratio));
    }
}
