public class App {
    public static void main(String[] args) throws Exception {
        // Build a collection
        Collection collection = new Collection();
        collection.setItem(0, new Item("Item 0"));
        collection.setItem(1, new Item("Item 1"));
        collection.setItem(2, new Item("Item 2"));
        collection.setItem(3, new Item("Item 3"));
        collection.setItem(4, new Item("Item 4"));
        collection.setItem(5, new Item("Item 5"));
        collection.setItem(6, new Item("Item 6"));
        collection.setItem(7, new Item("Item 7"));
        collection.setItem(8, new Item("Item 8"));
        
        // Create iterator
        Iterator iterator = collection.createIterator();
        
        // Skip every other item
        iterator.setStep(2);
        
        System.out.println("Iterating over collection:");
        
        for (Item item = iterator.first(); !iterator.isDone(); item = iterator.next()) {
            System.out.println(item.getName());
        }
    }
}
