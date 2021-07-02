package KTVTKPM.Composite;

import java.util.ArrayList;
import java.util.List;

public class ShirtShelfComposite implements ShirtComponent {
	private List<ShirtComponent> books = new ArrayList<>();
	 
    public ShirtShelfComposite(List<ShirtComponent> books) {
        this.books = books;
    }
 
    @Override
    public void showName() {
        for (ShirtComponent book : books) {
            book.showName();
        }
    }
 
    @Override
    public long totalType() {
        long total = 0;
        for (ShirtComponent book : books) {
            total += book.totalType();
        }
        return total;
    }
}
