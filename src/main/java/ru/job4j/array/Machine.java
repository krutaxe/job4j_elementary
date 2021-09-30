package ru.job4j.array;
import  java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int s = money - price;
        int[] rsl = new int[100];
        int size = 0;
        for (int i = 0; i < coins.length; i++) {
            while (coins[i] <= s) {
                s = s - coins[i];
                rsl[size] = coins[i];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
