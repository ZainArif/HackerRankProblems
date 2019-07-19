package com.company;

import java.awt.*;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    static void extraLongFactorials(int n) {
        BigInteger res = new BigInteger("1");
        for (int i=2;i<=n;i++)
            res = res.multiply(BigInteger.valueOf(i));
        System.out.println("Factorial of " + n + " = " + res);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number to calculate factorial : ");
        int n = scanner.nextInt();
        extraLongFactorials(n);
        scanner.close();
    }
}
