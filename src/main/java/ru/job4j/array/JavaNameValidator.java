package ru.job4j.array;
public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = true;
        for (int i = 0; i < name.length(); i++) {
            int code = name.codePointAt(i);
            if (name.codePointAt(0) < 97 || name.codePointAt(0) > 122) {
                valid = false;
                break;
            } else if ((code < 48 || code > 122) || (code > 90 && code < 97) || (code > 57 && code < 65)) {
                if (code == 36 || code == 95) {
                    continue;
                }
                valid = false;
                break;
            }
        }
        return valid;
    }
}
