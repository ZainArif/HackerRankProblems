package com.company;

import java.util.Scanner;

public class Main {

    static void staircase(int n) {
        for (int i=1;i<=n;i++){
            for (int j=1;j<=(n-i);j++)
                System.out.print(" ");
            for (int k=1;k<=i;k++)
                System.out.print("#");
            System.out.println();
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter number of stairs : ");
        int n = scanner.nextInt();
        staircase(n);
        scanner.close();
    }
}
