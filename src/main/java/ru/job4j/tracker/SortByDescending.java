package ru.job4j.tracker;

import java.util.Comparator;

public class SortByDescending implements Comparator<Item> {

    @Override
    public int compare(Item first, Item second) {
        SortByAscending sort = new SortByAscending();
        return sort.reversed().compare(first, second);
    }
}