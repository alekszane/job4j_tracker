package ru.job4j.tracker;

public class findItemByNameAction implements  UserAction {
    @Override
    public String name() {
        return "=== Find items by name  ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name item for find: ");
        Item[] equalItems = tracker.findByName(name);
        if (equalItems.length != 0) {
            for (Item it: equalItems) {
                System.out.println(it.toString());
            }
        } else {
            System.out.println("Заявки с таким id не найдены");
        }
        return true;
    }
}
