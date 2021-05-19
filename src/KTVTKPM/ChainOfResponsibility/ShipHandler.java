package KTVTKPM.ChainOfResponsibility;

public abstract class ShipHandler {
    private ShipHandler next;
    public void acceptShipping(CalculateDistance cd) {
        if (this.canShip(cd.getDistance())) {
            this.doShip(cd);
        } else if (next != null){
            next.acceptShipping(cd);
        }
    }

    public void setNext(ShipHandler s) {
        this.next = s;
    }

    protected abstract boolean canShip(int distance);
    protected abstract void doShip(CalculateDistance cd);
}
