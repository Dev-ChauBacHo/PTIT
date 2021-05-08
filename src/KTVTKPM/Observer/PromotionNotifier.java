package KTVTKPM.Observer;

import java.util.ArrayList;
import java.util.List;

public class PromotionNotifier implements PromotionSubject{
    private List<CustomerObserver> customerList;
    private String message;

    public PromotionNotifier() {
        // update the customer list
        customerList = new ArrayList<>();
    }

    @Override
    public boolean add(CustomerObserver customer) {
        return customerList.add(customer);
    }

    @Override
    public boolean remove(Customer customer) {
        return customerList.remove(customer);
    }

    @Override
    public void notifyAllCustomer() {
        for (CustomerObserver customer: customerList) {
            customer.getPromotioNotify(message);
        }
    }
}
