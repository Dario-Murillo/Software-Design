public interface IAbstractIterator {
    Item first();
    Item next();
    boolean isDone();
    Item currentItem();
}
