package ru.job4j.calculator;

public class Calculator {
    private static int x = 5;

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int z) {
        return z / x;
    }

    public int sum(int a) {
        return a + x;
    }

    public int multiply(int b) {
        return b * x;
    }

    public int sumAllOperation(int w) {
        return sum(w) + multiply(w) + minus(w) + divide(w);
    }

    public static void main(String[] args) {
       /** int one = 1;
        int two = 2;
        int six = 6;
        int four = 4;
        int five = 5;
        int onePlusTwo = one + two;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        System.out.println(onePlusTwo);
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);*/

       Calculator calculator = new Calculator();
        minus(12);
        Calculator.minus(7);
        calculator.divide(25);
        System.out.println(calculator.multiply(5));
        System.out.println(calculator.sum(14));
        System.out.println(calculator.sumAllOperation(40));
    }
}