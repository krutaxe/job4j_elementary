package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;

    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(350);
        float dollar = Converter.rubleToDollar(600);
        System.out.println("350 rubles are " + euro + " euro.");
        System.out.println("600 rubles are " + dollar + " dollar.");
        float in1 = 350;
        float in2 = 600;
        float expected1 = 5;
        float expected2 = 10;
        float out1 = Converter.rubleToEuro(in1);
        float out2 = Converter.rubleToDollar(in2);
        boolean passed1 = expected1 == out1;
        boolean passed2 = expected2 == out2;
        System.out.println("350 rubles are 5. Test result : " + passed1);
        System.out.println("600 rubles are 10. Test result : " + passed2);

    }

}

