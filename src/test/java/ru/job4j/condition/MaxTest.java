package ru.job4j.condition;
import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax5To2Then5() {
        int left = 5;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To7Then7() {
        int left = 3;
        int right = 7;
        int result = Max.max(left, right);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To3Then3() {
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To4To9Then9() {
        int left = 3;
        int right = 4;
        int up = 9;
        int result = Max.max(left, right, up);
        int expected = 9;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To4To9To20Then20() {
        int left = 3;
        int right = 4;
        int up = 9;
        int down = 20;
        int result = Max.max(left, right, up, down);
        int expected = 20;
        Assert.assertEquals(result, expected);
    }
}
