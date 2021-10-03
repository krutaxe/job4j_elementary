package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean condition = left > right;
        int result = condition ? left : right;
        return result;
    }

    public static int max(int left, int right, int up) {
        if (left > right && left > up) {
            return left;
        } else if (right > left && right > up) {
            return right;
        } else {
            return up;
        }
    }

    public static int max(int left, int right, int up, int down) {
        if (left > right && left > up && left > down) {
            return left;
        } else if (right > left && right > up && right > down) {
            return right;
        } else if (up > left && up > right && up > down) {
            return up;
        } else {
            return down;
        }
    }
}
