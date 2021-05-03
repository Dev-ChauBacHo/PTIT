package KTVTKPM.Observer;

public interface PromotionSubject {
    public boolean add(Customer customer);
    public boolean remove(Customer customer);
    public void notifyAllCustomer();
}
