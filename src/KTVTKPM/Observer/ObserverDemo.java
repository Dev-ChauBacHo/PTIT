package KTVTKPM.Observer;

public class ObserverDemo {
    private static PromotionSubject subject;

    public static void main(String[] args) {
        subject = new PromotionNotifier();

        CustomerObserver customer1 = new Customer(1, "084574", "abc@gm.cm", 1, 1);
        CustomerObserver customer2 = new Customer(2, "035434", "ert@gm.cm", 2, 2);
        CustomerObserver customer3 = new Customer(3, "08284357", "nmhf@gm.cm", 3, 3);

        subject.add(customer1);
        subject.add(customer2);
        subject.add(customer3);

        subject.notifyAllCustomer();
    }
}
