package KTVTKPM.Adapter;

public class ClotherAdapter implements ClotherTarget {

    ClotherAdaptee clotherAdaptee = new ClotherAdaptee();

    @Override
    public boolean checkClother(Clother clother) {
        if (!clotherAdaptee.checkClother(clother)) {
            return false;
        }
        return true;
    }
}
