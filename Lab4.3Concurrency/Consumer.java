package edu.sdccd.cisc191;

/**
 * Consumers receive a number of Items from a Warehouse
 *
 * Adapted from Tasha Frankie and Allan Schougaard
 */
public class Consumer extends Thread
{
    private String name;
    private Warehouse warehouse;
    private int numberOfItemsToConsume;

    public Consumer(String givenName, Warehouse givenWarehouse, int givenNumberOfItemsToConsume)
    {
        name = givenName;
        warehouse = givenWarehouse;
        numberOfItemsToConsume = givenNumberOfItemsToConsume;
    }

    @Override
    public void run() {
        System.out.println(name + " running in Thread: " + Thread.currentThread().getName());

        try {
        // TODO: consume numberOfItemsToProduce items
            for (int i = 0; i < numberOfItemsToConsume; i++) {
                Item item = warehouse.ship();
                System.out.println(name + " consumed item: " + item);
            }
        } catch (OutOfStockException e) {
                System.out.println(name + " attempted to consumed but insufficient.");
        }

        System.out.println(name + " ended.");
    }
}
