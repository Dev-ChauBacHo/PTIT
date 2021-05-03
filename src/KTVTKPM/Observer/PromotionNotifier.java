package KTVTKPM.Observer;

import java.util.List;

public class PromotionNotifier implements PromotionSubject{
    private List<Customer> customerList;
    private String message;

    public PromotionNotifier() {
        // update the customer list
    }

    @Override
    public boolean add(Customer customer) {
        return customerList.add(customer);
    }

    @Override
    public boolean remove(Customer customer) {
        return customerList.remove(customer);
    }

    @Override
    public void notifyAllCustomer() {
        for (Customer customer: customerList) {
            customer.getPromotioNotify(message);
        }
    }
}
