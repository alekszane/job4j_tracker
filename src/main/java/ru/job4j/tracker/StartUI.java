package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            }
            else if (select == 1) {
                System.out.println("=== Show all items  ====");
                if (tracker.findAll() != null) {
                    Item[] items = tracker.findAll();
                    for (Item it: items) {
                        System.out.println(it.toString());
                    }
                } else {
                    System.out.println("Заявки с таким не найдены");
                }

            }
            else if (select == 2) {
                System.out.println("=== Edit item  ====");
                System.out.print("Enter id item for edit: ");
                int id = Integer.valueOf(scanner.nextLine());
                System.out.print("Enter name item for edit: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                if (id > 0 && item != null) {
                    tracker.replace(id, item);
                    System.out.println("Success replace");
                } else {
                    System.out.println("Error replace");
                }
            }
            else if (select == 3) {
                System.out.println("=== Delete item  ====");
                System.out.print("Enter id item for delete: ");
                int id = Integer.valueOf(scanner.nextLine());
                if( id > 0 ) {
                    tracker.delete(id);
                    System.out.println("Success delete");
                } else {
                    System.out.println("Error delete");
                }
            }
            else if (select == 4) {
                System.out.println("=== Find item by Id  ====");
                System.out.print("Enter id item for find: ");
                int id = Integer.valueOf(scanner.nextLine());
                if (tracker.findById(id) != null) {
                    Item findItem = tracker.findById(id);
                    System.out.println(findItem.toString());
                } else {
                    System.out.println("Заявка с таким id не найдена");
                }
            }
            else if (select == 5) {
                System.out.println("=== Find items by name  ====");
                System.out.print("Enter name item for find: ");
                String name = scanner.nextLine();
                if (tracker.findByName(name) != null) {
                    Item[] equalItems = tracker.findByName(name);
                    for (Item it: equalItems) {
                        System.out.println(it.toString());
                    }
                }
            }
            else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
