package com.kodilla.demo;

public class Calculator {
    private int x;
    private int y;

    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void add() {
        int x1;
        System.out.println("Addition result: " + (x1 = x+y));
    }
    public void subtraction() {
        int y1;
        int x2;
        System.out.println("First subtraction result: " + (y1 = y-x));
        System.out.println("Second subtraction result: " + (x2 = x-y));
    }

    public static void main(String args[]) {
        Calculator calculator = new Calculator(3,8);
        calculator.add();
        calculator.subtraction();

    }
}
