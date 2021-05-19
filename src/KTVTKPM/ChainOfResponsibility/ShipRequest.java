package KTVTKPM.ChainOfResponsibility;

public class ShipRequest {
    public static ShipHandler getShipHandle() {
        ShipHandler motobike = new Motobike();
        ShipHandler car = new Car();
        ShipHandler train = new Train();

        motobike.setNext(car);
        car.setNext(train);

        return motobike;
    }
}
