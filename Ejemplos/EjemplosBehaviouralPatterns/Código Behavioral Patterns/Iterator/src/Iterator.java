public class Iterator implements IAbstractIterator {
    private Collection collection;
    private int current = 0;
    private int step = 1;

    // Constructor
    public Iterator(Collection collection) {
        this.collection = collection;
    }

    // Gets first item
    public Item first() {
        current = 0;
        return collection.getItem(current);
    }

    // Gets next item
    public Item next() {
        current += step;
        if (!isDone())
            return collection.getItem(current);
        else
            return null;
    }

    // Gets or sets step size
    public void setStep(int step) {
        this.step = step;
    }

    // Gets current iterator item
    public Item currentItem() {
        return collection.getItem(current);
    }

    // Gets whether iteration is complete
    public boolean isDone() {
        return current >= collection.getCount();
    }
}
