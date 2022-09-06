package com.apentyugov;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number");
            try {
                checkNumber(scanner.nextLine());
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void checkNumber(String input) {
        try {
            long i = Long.parseLong(input);
            if (i > 0) {
                for (long j = 1; j <= i; j++) {
                    System.out.println(methodOne(j));
//                    System.out.println("Result of \"method one\": " + methodOne(j));
//                    System.out.println("Result of \"method two\": " + methodTwo(j));
//                    System.out.println("Result of \"method three\": " + methodThree(j));
                }
            } else {
                throw new IllegalArgumentException("Number must be greater than 0");
            }

        } catch (NumberFormatException e) {
            throw new NumberFormatException("Number must be Integer");
        }

    }

    static String methodOne(long i) {
        String result = "FooBar";
        if (i % 3 != 0)
            result = result.replace("Foo", "");
        if (i % 5 != 0)
            result = result.replace("Bar", "");
        return result.isEmpty() ? String.valueOf(i) : result;
    }

    static String methodTwo(long i) {
        String result = "";
        if (i % 3 == 0)
            result += "Foo";
        if (i % 5 == 0)
            result += "Bar";
        return result.isEmpty() ? String.valueOf(i) : result;
    }

    static String methodThree(long i) {
        if (i % 15 == 0)
            return "FooBar";
        else if (i % 5 == 0)
            return "Bar";
        else if (i % 3 == 0)
            return "Foo";
        return String.valueOf(i);
    }


}
