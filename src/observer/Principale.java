package observer;

public class Principale {
    public static void main(String[] argv){
        Subject m = new Monitor();
        Strategy b = StratB.getInstanceB();
        Observer c = new Context(b);
        m.attach(c);
        m.setValue(1);
        m.setValue(0);
    }
}
