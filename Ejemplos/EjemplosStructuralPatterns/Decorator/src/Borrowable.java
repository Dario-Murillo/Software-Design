import java.util.ArrayList;
import java.util.List;

public class Borrowable extends Decorator {
    protected final List<String> borrowers = new ArrayList<>();

    public Borrowable(LibraryItem libraryItem) {
        super(libraryItem);
    }

    public void borrowItem(String name) {
        borrowers.add(name);
        libraryItem.setNumCopies(libraryItem.getNumCopies() - 1);
    }

    public void returnItem(String name) {
        borrowers.remove(name);
        libraryItem.setNumCopies(libraryItem.getNumCopies() + 1);
    }

    @Override
    public void display() {
        super.display();
        for (String borrower : borrowers) {
            System.out.println(" borrower: " + borrower);
        }
    }
}
