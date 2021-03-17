package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class StartUITest {
    @Test
    public void whenCreateItem() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "Item name", "1"}
        );
        Tracker tracker = Tracker.getTRACKER();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new CreateAction(out));
        actions.add(new ExitAction());
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll().get(0).getName(), is("Item name"));
    }

    @Test
    public void whenReplaceAction() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "Item name", "1", "1", "Edit item", "2"}
        );
        Tracker tracker = Tracker.getTRACKER();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new CreateAction(out));
        actions.add(new ReplaceItemAction(out));
        actions.add(new ExitAction());
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll().get(0).getName(), is("Edit item"));
    }

    @Test
    public void whenDeleteAction() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "Item name 1", "1", "Item name 2", "2", "1", "3"}
        );
        Tracker tracker = Tracker.getTRACKER();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new CreateAction(out));
        actions.add(new CreateAction(out));
        actions.add(new DeleteItemAction(out));
        actions.add(new ExitAction());
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll().get(0).getName(), is("Item name 2"));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = Tracker.getTRACKER();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new ExitAction());
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. === Exit Program ===" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindById() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "New task", "1", "1", "2"}
        );
        Tracker tracker = Tracker.getTRACKER();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new CreateAction(out));
        actions.add(new FindItemByIdAction(out));
        actions.add(new ExitAction());
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu." + System.lineSeparator()+
                        "0. === Create a new Item ====" + System.lineSeparator() +
                        "1. === Find item by Id  ====" + System.lineSeparator() +
                        "2. === Exit Program ===" + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. === Create a new Item ====" + System.lineSeparator() +
                        "1. === Find item by Id  ====" + System.lineSeparator() +
                        "2. === Exit Program ===" + System.lineSeparator() +
                        tracker.findById(1) + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. === Create a new Item ====" + System.lineSeparator() +
                        "1. === Find item by Id  ====" + System.lineSeparator() +
                        "2. === Exit Program ===" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindByAll() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "New task", "1", "2"}
        );
        Tracker tracker = Tracker.getTRACKER();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new CreateAction(out));
        actions.add(new ShowAllAction(out));
        actions.add(new ExitAction());
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu." + System.lineSeparator()+
                "0. === Create a new Item ====" + System.lineSeparator() +
                "1. === Show all items  ====" + System.lineSeparator() +
                "2. === Exit Program ===" + System.lineSeparator() +
                "Menu." + System.lineSeparator() +
                "0. === Create a new Item ====" + System.lineSeparator() +
                "1. === Show all items  ====" + System.lineSeparator() +
                "2. === Exit Program ===" + System.lineSeparator() +
                tracker.findById(1) + System.lineSeparator() +
                "Menu." + System.lineSeparator() +
                "0. === Create a new Item ====" + System.lineSeparator() +
                "1. === Show all items  ====" + System.lineSeparator() +
                "2. === Exit Program ===" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindByName() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "New task", "1", "New task", "2"}
        );
        Tracker tracker = Tracker.getTRACKER();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new CreateAction(out));
        actions.add(new FindItemByNameAction(out));
        actions.add(new ExitAction());
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu." + System.lineSeparator()+
                "0. === Create a new Item ====" + System.lineSeparator() +
                "1. === Find items by name  ====" + System.lineSeparator() +
                "2. === Exit Program ===" + System.lineSeparator() +
                "Menu." + System.lineSeparator() +
                "0. === Create a new Item ====" + System.lineSeparator() +
                "1. === Find items by name  ====" + System.lineSeparator() +
                "2. === Exit Program ===" + System.lineSeparator() +
                tracker.findById(1) + System.lineSeparator() +
                "Menu." + System.lineSeparator() +
                "0. === Create a new Item ====" + System.lineSeparator() +
                "1. === Find items by name  ====" + System.lineSeparator() +
                "2. === Exit Program ===" + System.lineSeparator()
        ));
    }

    @Test
    public void whenInvalidExitInt() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"8", "0"}
        );
        Tracker tracker = Tracker.getTRACKER();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new ExitAction());
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                String.format(
                        "Menu.%n"
                                + "0. === Exit Program ===%n"
                                + "Wrong input, you can select: 0 .. 0%n"
                                + "Menu.%n"
                                + "0. === Exit Program ===%n"
                )
        ));
    }
}