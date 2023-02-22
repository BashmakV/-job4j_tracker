package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        int temp = 0;
        Item[] rsl = new Item[items.length];
        for (Item item : items) {
            if (item != null) {
                rsl[temp] = item;
                temp++;
            }
        }
        return Arrays.copyOf(rsl, temp);
    }

    public Item[] findByName(String key) {
        int temp = 0;
        Item[] name = new Item[size];
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (key.equals(item.getName())) {
                name[temp] = item;
                temp++;
            }
        }
        return Arrays.copyOf(name, temp);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}