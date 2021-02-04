package ru.job4j.tracker;

public class ReplaceItemAction implements UserAction {

    @Override
    public String name() {
        return "=== Replace item  ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id item for replace: ");
        String name = input.askStr("Enter name item for replace: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Success replace");
        } else {
            System.out.println("Error replace");
        }
        return true;
    }
}
