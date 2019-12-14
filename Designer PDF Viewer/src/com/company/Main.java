package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = scanner.nextLine();
        System.out.println("Enter the height of letters : ");
        int[] h = new int[26];
        for (int i=0;i<26;i++)
            h[i] = scanner.nextInt();
        int result = designerPdfViewer(h,word);
        System.out.println(result);
    }

    static int designerPdfViewer(int[] h, String word) {
        int area = 0;
        HashMap<String,Integer> hashMap = new HashMap<>();
        int ascii = 97;
        char ch;
        for (int j=0;j<26;j++){
            ch = (char)ascii;
            hashMap.put(String.valueOf(ch),h[j]);
            ascii++;
        }
        int length = word.length();
        char[] letters = word.toCharArray();
        int[] heights = new int[length];
        for (int k=0;k<length;k++){
            heights[k] = hashMap.get(String.valueOf(letters[k]));
        }
        Arrays.sort(heights);
        int height = heights[length-1];
        area = height*length;
        return area;
    }
}
