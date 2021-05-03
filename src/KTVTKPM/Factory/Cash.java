package KTVTKPM.Factory;

public class Cash implements Payment {
    @Override
    public void pay() {
        System.out.println("Cash");
    }
}
