package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        boolean result = ab + ac > bc && ac + bc > ab && ab + bc > ac;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(exist(2, 2, 2));
        System.out.println(exist(2, 2, 6));
    }
}
