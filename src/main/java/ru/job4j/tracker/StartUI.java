package ru.job4j.tracker;

public class StartUI {

    public static void main(String[] args) {
       Tracker tracker = new Tracker();
       tracker.add(new Item(3, "item1"));
       tracker.add(new Item(2, "item1"));
       tracker.add(new Item(1, "item2"));
       System.out.println(tracker.findById(2).getId());
       Item[] it = tracker.findByName("item1");
       for (int i = 0; i < it.length; i ++){
           System.out.println(i);
       }
       Item item1 = new Item(5, "Replace Item");
       tracker.replace(1, item1);
        System.out.println(tracker.findById(1).getName());
    }
}
