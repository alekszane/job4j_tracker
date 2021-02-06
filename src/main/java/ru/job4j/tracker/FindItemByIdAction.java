package ru.job4j.tracker;

public class FindItemByIdAction implements UserAction {
    private final Output out;

    public FindItemByIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Find item by Id  ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id item for find: ");
        Item findItem = tracker.findById(id);
        if (findItem != null) {
            out.println(findItem.toString());
        } else {
            out.println("Заявка с таким id не найдена");
        }
        return true;
    }
}
