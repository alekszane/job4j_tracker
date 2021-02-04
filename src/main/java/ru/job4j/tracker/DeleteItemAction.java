package ru.job4j.tracker;

public class DeleteItemAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete item  ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id item for delete: ");
        if(tracker.delete(id)) {
            System.out.println("Success delete");
        } else {
            System.out.println("Error delete");
        }
        return true;
    }
}
