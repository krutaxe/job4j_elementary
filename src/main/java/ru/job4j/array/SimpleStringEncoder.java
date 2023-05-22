package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        int counter = 1;
        String result = String.valueOf(input.charAt(0));

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i - 1) == input.charAt(i)) {
                counter++;
            } else {
                if (counter > 1) {
                    result += counter;
                }
                result += String.valueOf(input.charAt(i));
                counter = 1;
            }
        }

        if (counter > 1) {
            result += counter;
        }

        return result;
    }
}
