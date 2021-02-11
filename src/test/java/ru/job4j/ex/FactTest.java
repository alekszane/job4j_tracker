package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenThrowIllegalArgumentException() {
        int rsl = Fact.calc(0);
        assertThat(rsl, is(1));
    }

    @Test()
    public void whenFactIs10() {
        int rsl = Fact.calc(10);
        assertThat(rsl, is(3628800));
    }

}