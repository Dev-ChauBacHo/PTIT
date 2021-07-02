package KTVTKPM.Adapter;

public class Main {

    public static void main(String[] args) {
        ClotherTarget adapter = new ClotherAdapter();

        System.out.println(adapter.checkClother(new Clother("old")));
        System.out.println(adapter.checkClother(new Clother("new")));
        System.out.println(adapter.checkClother(new Clother("old new")));
    }
}
