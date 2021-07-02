package KTVTKPM.Decorator;

public class ClotherOrder implements OrderInterface {

    @Override
    public String accept() {
        return "Clother accepted";
    }
}
