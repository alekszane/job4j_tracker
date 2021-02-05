package ru.job4j.tracker;

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
