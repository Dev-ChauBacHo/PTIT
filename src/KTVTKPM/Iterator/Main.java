package KTVTKPM.Iterator;

public class Main {
    public static void main(String[] args) {
        BookStorage storage = new BookStorage();
        storage.addBook(new Book("Doraemon"));
        storage.addBook(new Book("Harry Potter"));
        storage.addBook(new Book("One Piece"));
        storage.addBook(new Book("Listen"));

        BookIterator iterator = new BookIterator(storage);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Apply removing while iterating...");
        iterator = new BookIterator(storage);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }
    }
}
