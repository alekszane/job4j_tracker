package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class Tracker {
    private static Tracker TRACKER = null;
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;


    public static Tracker getTRACKER() {
        if (TRACKER == null) {
            TRACKER = new Tracker();
        }
        return TRACKER;
    }

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    public List<Item> findAll() {
        return items;
    }

    public List<Item> findByName(String key) {
       List<Item> equalsName = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                equalsName.add(item);
            }
        }
        return equalsName;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items.set(index, item);
        }
        return index != -1;
    }
    public boolean delete(int id) {
        int index = indexOf(id);
        if (index != -1) {
            items.remove(index);
            ids--;
        }
        return index != -1;
    }
}