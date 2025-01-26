package com.generic;

import java.util.List;

public class InventoryManager<T> {
    public List<T> items;

    public InventoryManager(List<T> items) {
        this.items = items;
    }

    public void addItem(T item) {
        this.items.add(item);
    }

    public void removeItem(T item) {
        this.items.remove(item);
    }

    public void listItems(List<T> items) {

    }
}
