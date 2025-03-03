package edu.sdccd.cisc191;

import java.util.ArrayList;
// import java.util.LinkedList;

/**
 * A Warehouse receives, stores and ships Items.
 *
 * Adapted from Tasha Frankie and Allan Schougaard
 */
public class Warehouse {
    /**
     * storage is managed as one big stack, where items are laid on top of each other
     */
    private ArrayList<Item> storage = new ArrayList<Item>();

    public synchronized int getNumberOfItemsInStock()
    {
        // TODO: return the number of items in storage
        return storage.size();
    }

    /**
     * TODO Modify to add item to the collection and make the tests pass.
     *
     * @param item the item to store in the Warehouse
     */
    public synchronized void receive(Item item) {
        // System.out.println("Warehouse receive(" + item + ") running in Thread: " + Thread.currentThread().getName());

        // TODO: store item at the front of the list
        storage.add(0, item);
        notifyAll();
    }

    /**
     * TODO Modify to remove an item from the collection and make the tests pass
     *
     * @return the item that was retrieved from storage
     * @throws OutOfStockException if there are no items to ship
     */
    public synchronized Item ship() throws OutOfStockException {
        // System.out.println("Warehouse ship() running in Thread: " + Thread.currentThread().getName());

        // TODO: return the first item in the list,
        if (storage.isEmpty()) {
            throw new OutOfStockException("Out of stock.");
        }
        return storage.remove(0);
    }
}
