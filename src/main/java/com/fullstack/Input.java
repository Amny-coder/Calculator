package com.fullstack;

import java.util.Scanner;

public class Input {
    private String[] expression;
    private final Scanner scan;

    public Input() {
        scan = new Scanner(System.in);
    }

    /**
     * It reads String input from the console and
     * @return an array of the expression with a
     * maximum of five allowing 3 variables and two operators
     */
    public String[] fullExpression() {

        expression = new String[5];
        System.out.println("Form the Expression :: ");

        for (int i = 0; i < expression.length; i++) {
            expression[i] = scan.nextLine();
        }
        scan.close();
        return expression;
    }

    /**
     * It reads String input from the console and
     * @return an array of the expression with a
     * maximum of five allowing 2 variables and one operator
     */
    public String[] halfExpression() {

        expression = new String[3];
        System.out.println("Form the Expression :: ");

        for (int i = 0; i < expression.length; i++) {
            expression[i] = scan.nextLine();
        }
        scan.close();
        return expression;
    }
}
