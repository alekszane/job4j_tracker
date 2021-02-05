package ru.job4j.tracker;

public class ShowAllAction implements UserAction {

    @Override
    public String name() {
        return "=== Show all items  ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] items = tracker.findAll();
        if (items.length > 0) {
            for (Item it: items) {
                System.out.println(it.toString());
            }
        } else {
            System.out.println("Заявки с таким не найдены");
        }
        return true;
    }
}
