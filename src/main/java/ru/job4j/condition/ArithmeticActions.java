package ru.job4j.condition;

public class ArithmeticActions {
    public static String checkNumber(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) {
            return "Hello, World!!!";
        }
        if (number % 3 == 0) {
            return "Hello";
        }
        if (number % 5 == 0) {
            return "World";
        }
        return "Operation not support";
    }
}
