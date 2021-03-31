package ru.job4j.tracker;

import org.junit.Test;

import java.util.*;


import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SortByAscendingTest {
    @Test
    public void whenSortByAscendingName() {
        List<Item> items = Arrays.asList(
                new Item(1, "QQQ"),
                new Item(3, "AAA"),
                new Item(2, "ZZZ")
        );
        Collections.sort(items, new SortByAscending());
        assertThat(items.get(0).getName(), is("AAA"));
    }

    @Test
    public void whenSortByAscendingID() {
        List<Item> items = Arrays.asList(
                new Item(3, "QQQ"),
                new Item(5, "AAA"),
                new Item(1, "ZZZ")
        );
        Collections.sort(items);
        assertThat(items.get(0).getName(), is("ZZZ"));
    }

    @Test
    public void whenSortByDescendingName() {
        List<Item> items = Arrays.asList(
                new Item(2, "CCC"),
                new Item(1, "AAA"),
                new Item(5, "ZZZ")
        );
        Collections.sort(items, new SortByDescending());
        assertThat(items.get(0).getName(), is("ZZZ"));
    }

    @Test
    public void whenSortByDescendingId() {
        List<Item> items = Arrays.asList(
                new Item(5, "CCC"),
                new Item(7, "AAA"),
                new Item(9, "ZZZ")
        );
        Collections.sort(items, new SortByDescending());
        assertThat(items.get(0).getName(), is("ZZZ"));
    }
}