package KTVTKPM.ChainOfResponsibility;

public class Motobike extends ShipHandler{

    @Override
    protected boolean canShip(int distance) {
        return distance < 50;
    }

    @Override
    protected void doShip(CalculateDistance cd) {
        System.out.println("Motobike is shipping");
    }
}
