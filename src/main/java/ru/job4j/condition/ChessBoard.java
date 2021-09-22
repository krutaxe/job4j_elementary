package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rls = 0;
            if (x1 >= 0 && x2 >= 0 && y1 >= 0 && y2 >= 0 && x1 != x2 && y1 != y2 && x1 <= 7 && x2 <= 7 && y1 <= 7 && y2 <= 7) {
                rls = Math.abs(x2 - x1);
                rls = rls == Math.abs(y2 - y1) ? rls : 0;

        }
        return rls;
    }

    public static void main(String[] args) {
        System.out.println(way(0, 0, 6, 6));
        System.out.println(way(2, 6, 4, 1));
    }
}
