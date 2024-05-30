import java.util.ArrayList;
import java.util.List;

public class Collection implements IAbstractCollection {
    private List<Item> items = new ArrayList<>();

    public Iterator createIterator() {
        return new Iterator(this);
    }

    // Gets item count
    public int getCount() {
        return items.size();
    }

    // Indexer
    public Item getItem(int index) {
        return items.get(index);
    }

    public void setItem(int index, Item item) {
        items.add(index, item);
    }
}
