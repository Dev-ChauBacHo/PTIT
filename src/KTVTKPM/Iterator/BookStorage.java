package KTVTKPM.Iterator;

public class BookStorage {

    private final Book[] books = new Book[5];
    private int index;

    public void addBook(Book book){
        int i = index++;
        book.setId(i);
        books[i] = book;
    }

    public Book[] getBooks(){
        return books;
    }
}
