package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        int index = 0;
        for (String s : value) {
            if (key.equals(s)) {
                rsl = index;
                break;
            }
            index++;
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element not found");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] seasons = new String[] {"Winter", "Spring", "Summer", "Autumn"};
        String key = "Summer";
        try {
            System.out.println(indexOf(seasons, key));

        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
