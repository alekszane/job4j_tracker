package ru.job4j.tracker;

import java.util.List;

public class FindItemByNameAction implements  UserAction {
    private final Output out;

    public FindItemByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Find items by name  ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name item for find: ");
        List<Item> equalItems = tracker.findByName(name);
        if (!equalItems.isEmpty()) {
            for (Item it: equalItems) {
               out.println(it.toString());
            }
        } else {
            out.println("Заявки с таким id не найдены");
        }
        return true;
    }
}
