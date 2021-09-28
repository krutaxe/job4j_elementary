package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class MatrixCheckTest {
    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        Assert.assertTrue(result);
    }

    @Test
    public void whenHasMonoHorizontalMy() {
        char[][] input = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {'X', 'X', ' '},
                {' ', ' ', ' '},
        };
        int row = 3;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        Assert.assertFalse(result);
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        int column = 2;
        boolean result = MatrixCheck.monoVertical(input, column);
        Assert.assertTrue(result);
    }

    @Test
    public void whenHasMonoVerticalMy() {
        char[][] input = {
                {' ', 'X', ' '},
                {' ', 'X', ' '},
                {' ', 'X', ' '},
                {' ', 'X', ' '},
                {' ', 'X', ' '},
                {' ', 'X', ' '},
        };
        int column = 1;
        boolean result = MatrixCheck.monoVertical(input, column);
        Assert.assertTrue(result);
    }
}