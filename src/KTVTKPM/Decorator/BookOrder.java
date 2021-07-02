package KTVTKPM.Decorator;

public class BookOrder implements OrderInterface {

    @Override
    public String accept() {
        return "Book accepted";
    }
}
