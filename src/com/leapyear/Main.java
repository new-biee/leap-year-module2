package com.leapyear;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        year = scanner.nextInt();
        boolean isLeapYear = false;

//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    System.out.printf("%d is a leap year", year);
//                } else {
//                    System.out.printf("%d is NOT a leap year", year);
//                }
//            } else {
//                System.out.printf("%d is a leap year", year);
//            }
//        }else {
//            System.out.printf("%d is NOT a leap year", year);
//        }

//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    isLeapYear = true;
//                }
//            } else {
//                isLeapYear = true;
//            }
//        }

        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }
}
