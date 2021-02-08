package ru.job4j.tracker;

public class ReplaceItemAction implements UserAction {
    private final Output out;

    public ReplaceItemAction(Output out) {
        this.out = out;
    }

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
            out.println("Success replace");
        } else {
            out.println("Error replace");
        }
        return true;
    }
}
