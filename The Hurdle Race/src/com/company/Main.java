package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many hurdles are there?");
        int n = scanner.nextInt();
        System.out.println("Enter the maximum height Dan can jump : ");
        int k = scanner.nextInt();
        System.out.println("Enter the height of hurdles : ");
        int[] heights = new int[n];
        for (int i=0;i<heights.length;i++)
            heights[i] = scanner.nextInt();

        int result = hurdleRace(k,heights);
        System.out.println(result);
    }

    static int hurdleRace(int k, int[] height) {
        int doses = 0;
        int n = height.length;
        Arrays.sort(height);
        int maxHeight = height[n-1];
        if (k < maxHeight)
            doses = maxHeight - k;
        return doses;
    }
}
