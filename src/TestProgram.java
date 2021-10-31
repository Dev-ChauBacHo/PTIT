@FunctionalInterface
interface Test {
    void myFunc();
}

public class TestProgram {
    public static void main(String[] args) {
        Test test = () -> System.out.println("Hello");
        test.myFunc();

        Pair<Integer, Integer> p = new Pair<>(2, 3);
    }

    private static class Pair<T, V> {
        private int a, b;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
}
