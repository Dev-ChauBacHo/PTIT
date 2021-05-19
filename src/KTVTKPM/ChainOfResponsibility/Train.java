package KTVTKPM.ChainOfResponsibility;

public class Train extends ShipHandler{

    @Override
    protected boolean canShip(int distance) {
        return distance > 500;
    }

    @Override
    protected void doShip(CalculateDistance cd) {
        System.out.println("Train is shipping");
    }
}
