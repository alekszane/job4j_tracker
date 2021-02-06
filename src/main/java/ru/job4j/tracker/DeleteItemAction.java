package ru.job4j.tracker;

public class DeleteItemAction implements UserAction {
    private final Output out;

    public DeleteItemAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Delete item  ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id item for delete: ");
        if(tracker.delete(id)) {
            out.println("Success delete");
        } else {
            out.println("Error delete");
        }
        return true;
    }
}
