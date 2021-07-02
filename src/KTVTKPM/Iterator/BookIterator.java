package KTVTKPM.Iterator;

import java.util.Iterator;

public class BookIterator implements Iterator<Book> {

    private Book[] books;
    int pos;

    public BookIterator(BookStorage books) {
        this.books = books.getBooks();
    }

    @Override
    public boolean hasNext() {
        if (pos >= books.length || books[pos] == null)
            return false;
        return true;
    }

    @Override
    public Book next() {
        return books[pos++];
    }

    @Override
    public void remove() {
        if (pos <= 0)
            throw new IllegalStateException("Illegal position");
        if (books[pos - 1] != null) {
            for (int i = pos - 1; i < (books.length - 1); i++) {
                books[i] = books[i + 1];
            }
            books[books.length - 1] = null;
        }
    }
}
