package com.fullstack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Input inputObj = new Input();
        Calculator cal = new Calculator();

        try {
            System.out.print("Are You Going to use Three Arithmetic Operators OR Two? >> ");
            if (scan.nextInt() == 3)
                cal.calculateForThreeVariables(inputObj.fullExpression());
            else
                cal.calculateForTwoVariables(inputObj.halfExpression());

        } catch (NumberFormatException ignored) {}

    }
}