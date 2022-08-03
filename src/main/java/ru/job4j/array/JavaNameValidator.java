package ru.job4j.array;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        boolean valid = true;
        if (name.isEmpty() || Character.isDigit(name.codePointAt(0))
                || Character.isUpperCase(name.codePointAt(0))) {
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            int code = name.codePointAt(i);
            if (!isLowerLatinLetter(code) && !isUpperLatinLetter(code)
                    && !isSpecialSymbol(code) && !isNumberSymbol(code)) {
                valid = false;
                break;
            }
        }

        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        boolean rsl = false;
        if (code == 36 || code == 95) {
            rsl = true;
        }
        return rsl;
    }

    public static boolean isNumberSymbol(int code) {
        boolean rsl = false;
        if (code > 47 && code < 58) {
            rsl = true;
        }
        return rsl;
    }

    public static boolean isUpperLatinLetter(int code) {
        boolean rsl = false;
        if (code > 65 && code < 90) {
            rsl = true;
        }
        return rsl;
    }

    public static boolean isLowerLatinLetter(int code) {
        boolean rsl = false;
        if (code > 97 && code < 122) {
            rsl = true;
        }
        return rsl;
    }

}
