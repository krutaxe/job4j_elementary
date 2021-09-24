package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ArithmeticActionsTest {
    @Test
    public void checkNumberHelloWorld() {
        String s = ArithmeticActions.checkNumber(15);
        assertThat(s, is("Hello, World!!!"));
    }

    @Test
    public void checkNumberHello() {
        String s = ArithmeticActions.checkNumber(9);
        assertThat(s, is("Hello"));
    }

    @Test
    public void checkNumberWorld() {
        String s = ArithmeticActions.checkNumber(25);
        assertThat(s, is("World"));
    }

    @Test
    public void checkNumberDefault() {
        String s = ArithmeticActions.checkNumber(14);
        assertThat(s, is("Operation not support"));
    }
}