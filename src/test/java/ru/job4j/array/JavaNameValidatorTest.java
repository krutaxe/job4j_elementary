package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static ru.job4j.array.JavaNameValidator.isNameValid;

class JavaNameValidatorTest {
    @Test
    void whenFullLatValid() {
        assertThat(isNameValid("first")).isTrue();
    }

    @Test
    void whenLatNumberValid() {
        assertThat(isNameValid("first1")).isTrue();
    }

    @Test
    void whenLatNumberUnderValid() {
        assertThat(isNameValid("first_user")).isTrue();
    }

    @Test
    void whenNumberInValid() {
        assertThat(isNameValid("123")).isFalse();
    }

    @Test
    void whenNumber1() {
        assertThat(isNameValid("fir$t")).isTrue();
    }

    @Test
    void whenNumber2() {
        assertThat(isNameValid("first_")).isTrue();
    }

    @Test
    void whenNumber() {
        assertThat(isNameValid("fi?rst")).isFalse();
    }

    @Test
    void whenEmptyNameInvalid() {
        assertThat(isNameValid("")).isFalse();
    }

    @Test
    void whenFullLatAndSomeUpperCaseLettersValid() {
        assertThat(isNameValid("fIRST")).isTrue();
    }

    @Test
    void whenLatWithSpecialSymbolUnderValid() {
        assertThat(isNameValid("first_user")).isTrue();
    }

    @Test
    void whenFirstLatinUpperCaseIsInvalid() {
        assertThat(isNameValid("First")).isFalse();
    }

    @Test
    void whenLatNumberAndTwoSpecialSymbolsUnderValid() {
        assertThat(isNameValid("fir$t_u$er_1")).isTrue();
    }

}