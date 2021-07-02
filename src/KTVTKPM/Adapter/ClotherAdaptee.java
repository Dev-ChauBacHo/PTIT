package KTVTKPM.Adapter;

public class ClotherAdaptee {
    public boolean checkClother(Clother clother) {
        if (clother.getName().contains("old")) {
            return false;
        }
        return true;
    }
}
