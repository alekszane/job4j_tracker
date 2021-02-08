package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class StartUITest {
    @Test
    public void whenCreateItem() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceAction() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "Item name", "1", "1", "Edit item", "2"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new ReplaceItemAction(out),
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Edit item"));
    }

    @Test
    public void whenDeleteAction() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "Item name 1", "1", "Item name 2", "2", "1", "3"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new CreateAction(out),
                new DeleteItemAction(out),
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name 2"));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction()
        };
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
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new FindItemByIdAction(out),
                new ExitAction()
        };
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
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new ShowAllAction(out),
                new ExitAction()
        };
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
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new FindItemByNameAction(out),
                new ExitAction()
        };
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
}