package KTVTKPM.ChainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        ShipRequest.getShipHandle().acceptShipping(new CalculateDistance(100));
    }
}
