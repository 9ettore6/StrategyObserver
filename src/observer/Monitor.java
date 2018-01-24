package observer;

public class Monitor extends Subject {
    private int value = 0;

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int v){
        this.value = v;
        notifica();
    }
}
