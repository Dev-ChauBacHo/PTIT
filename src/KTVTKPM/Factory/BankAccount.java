package KTVTKPM.Factory;

public class BankAccount implements Payment{
    @Override
    public void pay() {
        System.out.println("Bank Account");
    }
}
