package ru.job4j.tracker;

public class StartUI {

    public static void main(String[] args) {
       Tracker tracker = new Tracker();
       tracker.add(new Item(3, "item1"));
       tracker.add(new Item(2, "item1"));
       tracker.add(new Item(1, "item2"));
       Item[] it = tracker.findByName("item1");
       for (int i = 0; i < it.length; i ++){
           System.out.println(it[i].getId());
       }
       Item item1 = new Item(5, "Replace Item");
       tracker.replace(1, item1);
        System.out.println(tracker.findById(1).getName());
        System.out.println(" - - - - - - - - - ");
        Item item2 = new Item(4, "Show Item toString" );
        System.out.println(item2);
    }
}
