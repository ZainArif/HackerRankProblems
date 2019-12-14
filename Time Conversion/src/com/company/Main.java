package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a time in 12 hour clock format (i.e. hh:mm:ssAM/PM) :");
        String s = scanner.nextLine();
        String result = timeConversion(s);
        System.out.println(result);
    }

    static String timeConversion(String s) {
        String[] str = s.split(":");

        if (str[2].toLowerCase().contains("am")){
            if (str[0].equals("12")){
                str[0] = "00";
                str[2] = str[2].substring(0,2);
            }
            else
                str[2] = str[2].substring(0,2);
        }
        else {
            if (str[0].equals("12"))
                str[2] = str[2].substring(0,2);
            else {
                str[0] = String.valueOf(Integer.parseInt(str[0]) + 12);
                str[2] = str[2].substring(0,2);
            }
        }
        String result = str[0] + ":" + str[1] + ":" + str[2];
        return result;
    }
}
