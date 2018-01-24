package observer;

import java.util.ArrayList;

public abstract class Subject {
    private ArrayList<Observer> obs = new ArrayList<>();

    public abstract int getValue();

    public abstract void setValue(int v);

    public void attach(Observer o) {
        obs.add(o);
    }

    public void detach(Observer o) {
        obs.remove(o);
    }

    public void notifica() {
        for (Observer ob : obs) {
            ob.update(this);
        }
    }
}
