package KTVTKPM.Observer;

public interface PromotionSubject {
    public boolean add(CustomerObserver customer);
    public boolean remove(Customer customer);
    public void notifyAllCustomer();
}
