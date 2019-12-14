package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of test cases : ");
        int t = scanner.nextInt();
        for (int i=0;i<t;i++){
            System.out.println("Enter the number of cycles for this test case : ");
            int n = scanner.nextInt();
            int result = utopianTree(n);
            System.out.println(result);
        }
    }

    static int utopianTree(int n) {
        int period = 0;
        int height = 1;
        if (period==n)
            return height;
        else{
            while (period<n){
                period++;
                if (period%2==0)
                    height++;
                else
                    height*=2;
            }
            return height;
        }
    }
}
