package observer;

public class StratB extends Strategy {
    private static Strategy instanceB;

    private StratB() {
    }

    public static Strategy getInstanceB() {
        if (instanceB == null)
            instanceB = new StratB();
        return instanceB;
    }

    @Override
    public void algorithm() {
        System.out.println("Strategia B");
    }
}

