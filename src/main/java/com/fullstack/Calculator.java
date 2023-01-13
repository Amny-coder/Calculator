package com.fullstack;

import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    private int a;
    private int b;
    private int c;

    public Calculator() {
        a = 0;
        b = 0;
        c = 0;
    }

    public void calculateForThreeVariables(String[] expr) {
        a = Integer.parseInt(expr[0]);
        b = Integer.parseInt(expr[2]);
        c = Integer.parseInt(expr[4]);

        int result = 0;

        try {
            if (isInRange()) {
                switch (expr[1]) {
                    case "+" -> {

                        if (Objects.equals(expr[3], "+"))
                            result = a + b + c;
                        else if (expr[3].equals("-"))
                            result = a + b - c;
                        else if (expr[3].equals("*"))
                            result = a + b * c;
                        else
                            result = a + b / c;
                        System.out.println(result);
                    }
                    case "-" -> {

                        if (Objects.equals(expr[3], "+"))
                            result = a - b + c;
                        else if (expr[3].equals("-"))
                            result = a - b - c;
                        else if (expr[3].equals("*"))
                            result = a - b * c;
                        else
                            result = a - b / c;
                        System.out.println(result);
                    }
                    case "*" -> {

                        if (Objects.equals(expr[3], "+"))
                            result = a * b + c;
                        else if (expr[3].equals("-"))
                            result = a * b - c;
                        else if (expr[3].equals("*"))
                            result = a * b * c;
                        else
                            result = a * b / c;
                        System.out.println(result);
                    }
                    case "/" -> {
                        if (Objects.equals(expr[3], "+"))
                            result = a / b + c;
                        else if (expr[3].equals("-"))
                            result = a / b - c;
                        else if (expr[3].equals("*"))
                            result = a / b * c;
                        else
                            result = a / b / c;
                        System.out.println(result);
                    }
                }
            }
        } catch (NumberFormatException | StackOverflowError e) {
            e.printStackTrace();
        }
    }

    //a+b
    public void calculateForTwoVariables(String[] expr) {
        a = Integer.parseInt(expr[0]);
        b = Integer.parseInt(expr[2]);

        int result = 0;

        try {
            if (isInRange()) {
                switch (expr[1]) {
                    case "+" -> {
                        result = a + b;
                        System.out.println(result);
                    }
                    case "-" -> {
                        result = a - b;
                        System.out.println(result);
                    }
                    case "*" -> {
                        result = a * b;
                        System.out.println(result);
                    }
                    case "/" -> {
                        result = a / b;
                        System.out.println(result);
                    }
                }
            }
        } catch (NumberFormatException | StackOverflowError e) {
            e.printStackTrace();
        }
    }

    private boolean isInRange() {
        return (a > 0 && a <= 10 && b > 0 && b <= 10 && c >= 0 && c <= 10);
    }
}
