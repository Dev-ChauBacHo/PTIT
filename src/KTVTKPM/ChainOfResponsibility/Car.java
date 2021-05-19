package KTVTKPM.ChainOfResponsibility;

public class Car extends ShipHandler{

    @Override
    protected boolean canShip(int distance) {
        return distance > 50 && distance < 200;
    }

    @Override
    protected void doShip(CalculateDistance cd) {
        System.out.println("Car is shipping");
    }
}
