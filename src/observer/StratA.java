package observer;

public class StratA extends Strategy {
    private static Strategy instanceA;

    private StratA() {
    }

    public static Strategy getInstanceA() {
        if (instanceA == null)
            instanceA = new StratA();
        return instanceA;
    }

    @Override
    public void algorithm() {
        System.out.println("Strategia A");
    }
}
